package batmonGen;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Pattern;

import batmonGen.State.SetType;

public class NeverclaimToBuchi {
    public static Automaton parse(String path) throws IOException, ReadBuchiDescriptionException{
        Automaton buchi = new Automaton();
        ArrayList<String[]> transitionArrayList = new ArrayList<>(); //A list of arrays, where the order of the array elements is: stateName, labelName, destinationStateName

        boolean settingState = false;
        int rowNumber = 1;
        String input; 
        java.io.BufferedReader br = new java.io.BufferedReader(new FileReader(new File(path)));
        while ((input = br.readLine()) != null) {
            if(rowNumber != 1)
                input = input.trim();

            //First row in file
            if(!(getStringFromText("(never\\s*\\{\\s*(/\\*\\s*.*\\*/)?)", input.toLowerCase()).equals(""))) {
                if(rowNumber == 1) {
                    String name = getStringFromText("/\\*\\s*(.*)\\s*\\*/", input.toLowerCase());
                    if(name.equals("")) name = "monitor_name";
                    
                    name = name.replace("!", "NOT");
                    name = name.replace("&", "AND");
                    name = name.replace("|", "OR");
                    name = name.replace("->", "IMPLIES");
                    name = name.replace("(", "_");
                    name = name.replace(")", "_");
                    name = name.replaceAll("\\W", "");
                    if(Character.isDigit(name.charAt(0))) name = "_"+name;

                    if(!name.equals(""))
                        buchi.setName(name);
                    else
                        throw new ReadBuchiDescriptionException(rowNumber, input, "Invalid monitor name!");
                }
                else {
                    throw new ReadBuchiDescriptionException(rowNumber, input, "Description should start in the first row!");
                }
            }
            //New state
            else if(!(getStringFromText("(.*_.*:)", input.toLowerCase()).equals(""))) {
                State tempState = new State();
                String name = getStringFromText("(.*_.*):", input.toLowerCase()).trim();
                if(nameAlreadyExists(buchi, name))
                    throw new ReadBuchiDescriptionException(rowNumber, input, "One name can not be used for more than one state!");
                else if(!Pattern.compile("^[A-Za-z0-9]*_{1}[A-Za-z0-9]*$").matcher(name).find())
                	throw new ReadBuchiDescriptionException(rowNumber, input, "State name should NOT contain special characters, only a single underscore, standard letters and numbers are allowed!");
                else if(Pattern.compile("[0-9]").matcher(String.valueOf(name.charAt(0))).find())
                    throw new ReadBuchiDescriptionException(rowNumber, input, "The name should not start with a number!");
                else
                    tempState.setName(name);
                //Accepting state
                if(!(getStringFromText("(accept_.*)", input.toLowerCase()).equals(""))) {
                    tempState.setAccepting(true);
                }
                else {
                    tempState.setAccepting(false);
                }
                buchi.addState(tempState);
                
                //Initial state
                if(!(getStringFromText("(.*_init:)", input.toLowerCase()).equals(""))) {
                    if(buchi.getStates().size() != 0) {
                        throw new ReadBuchiDescriptionException(rowNumber, input, "Only one initial state is allowed (initial state should be definied first)!");
                    }
                    else {
                        buchi.setInitState(tempState);
                    }
                }
                else if(buchi.getInitState() == null)
                	buchi.setInitState(tempState);
            }
            //The start of the transition list
            else if(input.toLowerCase().equals("if")) {
                settingState = true;
            }
            //New transition
            else if(!(getStringFromText("(::\\s*.*\\s*->\\s*goto\\s*.*_.*)", input.toLowerCase()).equals(""))) {
                if(settingState) {
                    String[] temp_transitionArray = new String[3];
                    temp_transitionArray[0] = buchi.getStates().get(buchi.getStates().size()-1).getName();
                    temp_transitionArray[1] = getStringFromText("::\\s*(.*)\\s*->" , input).trim();
                    temp_transitionArray[2] = getStringFromText("goto\\s*(.*)" , input.toLowerCase()).trim();

                    String[] tempLetters = temp_transitionArray[1].split("&&|\\|\\|");
                    for(String unstripped_letter : tempLetters) {
                        unstripped_letter = unstripped_letter.trim();
                        if(!unstripped_letter.equals(Label.TRUE) && !unstripped_letter.equals(Label.EPSILON)) {
                            //buchi.addLetter(getStringFromText("([a-zA-Z]+[a-zA-Z0-9]*\\.[a-zA-Z]+[a-zA-Z0-9]*\\([a-zA-Z0-9]*\\)\\.[a-zA-Z]+[a-zA-Z0-9]*|[a-zA-Z]+[a-zA-Z0-9]*)", unstripped_letter));
                            if(unstripped_letter.contains(".") || unstripped_letter.contains(",")) {
                                buchi.setScenarioBased(true);
                                String tempString = getStringFromText("\\((.*)\\)", unstripped_letter);
                                if(tempString.contains("!"))
                                    tempString = getStringFromText("!\\((.*)\\)", tempString);
                                buchi.addLetter(tempString); 
                            }
                            else
                                buchi.addLetter(getStringFromText("([_]*[a-zA-Z]+[_a-zA-Z0-9]*)", unstripped_letter));

                            if(temp_transitionArray[1].matches(".*!\\s*[^(].*")) {
                                throw new ReadBuchiDescriptionException(rowNumber, input, "Illegal negation in transition label! The negated expression should be in form of: \"(!(<expression>))\"");
                            }
                        }
                    }

                    transitionArrayList.add(temp_transitionArray);
                }
                else {
                    throw new ReadBuchiDescriptionException(rowNumber, input, "Illegal transition description (missing if-fi/do-od block)!");
                }
            }
            //Skip
            else if(!(getStringFromText("(skip)", input.toLowerCase()).equals(""))) {
                String[] temp_transitionArray = new String[3];
                temp_transitionArray[0] = buchi.getStates().get(buchi.getStates().size()-1).getName();
                temp_transitionArray[1] = Label.TRUE;
                temp_transitionArray[2] = buchi.getStates().get(buchi.getStates().size()-1).getName();
                transitionArrayList.add(temp_transitionArray);
            }
            //The end of the transition list
            else if(input.toLowerCase().equals("fi;")) {
                settingState = false;
            }
            //The end of the description
            else if(!(getStringFromText("(\\}|)", input.toLowerCase()).equals(""))) { 
                if(buchi.getStates().size() == 0)
                    throw new ReadBuchiDescriptionException(rowNumber, input, "The automaton should have at least 1 state");
            }
            else if(input.toLowerCase().equals("empty")) {
            	State emptyState = new State();
            	emptyState.setAccepting(false);
            	emptyState.setName("empty_buchi");
            	emptyState.setSetType(SetType.Bad);
            	
            	Label label = new Label(Label.TRUE, new ArrayList<String>());
            	Transition transition = new Transition();
            	transition.setDestinationStateName("empty_buchi");
            	transition.setLabel(label);
            	
            	emptyState.addTransition(transition);
            	
            	buchi.addState(emptyState);
            	buchi.setInitState(emptyState);
            	buchi.setScenarioBased(false);
            	buchi.setName("empty_monitor");
            	return buchi;
            }
            else {
                throw new ReadBuchiDescriptionException(rowNumber, input, "Can not parse this row...");
            }

            rowNumber++;
        }

        buchi.getAbc().sort(Comparator.comparingInt(String::length));
        Collections.reverse(buchi.getAbc());

        createTransitionsFromTransitionArrayList(buchi, transitionArrayList);

        return buchi;
    }

    private static void createTransitionsFromTransitionArrayList(Automaton automaton, ArrayList<String[]> transitionArrayList) {
        for(int i = 0; i < transitionArrayList.size(); i++) {
            String[] transitionArray = transitionArrayList.get(i);
            for(int j = 0; j < automaton.getStates().size(); j++) {
                if(automaton.getStates().get(j).getName().equals(transitionArray[0])) {
                    if(transitionArray[1].equals(Label.TRUE)) {
                        for (String transitionLabelName : automaton.getEveryPossibleLabelName()) {
                            Transition temp_transition = new Transition();
                            temp_transition.setDestinationStateName(transitionArray[2]);
                            temp_transition.setLabel(new Label(transitionLabelName, automaton.getAbc()));

                            automaton.getStates().get(j).getTransitions().add(temp_transition);
                        }
                    }
                    else {
                        Transition transition = new Transition();
                        transition.setLabel(new Label(transitionArray[1], automaton.getAbc()));
                        transition.setDestinationStateName(transitionArray[2]);
                        automaton.getStates().get(j).addTransition(transition);
                    }
                }
            }
        }
    }

    private static boolean nameAlreadyExists(Automaton buchi, String name) {
        for(State state : buchi.getStates()) {
            if(state.getName().equals(name))
                return true;
        }

        return false;
    }

    private static String getStringFromText(String regex, String stringToSearch) {
        String result = "";

        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(stringToSearch);

        if(matcher.find()) {
            result = matcher.group(1);
        }

        return result;
    }
}