package batmonGen;
import java.util.ArrayList;

public class Automaton {
    private String name;
    private State initState;
    private ArrayList<State> states;
    private ArrayList<String> abc;
    private boolean isScenarioBased;

    public Automaton() {
        states = new ArrayList<>();
        abc = new ArrayList<>();
    }

    public Automaton(Automaton automaton) {
        this.name = automaton.name;
        this.initState = new State(automaton.initState);
        this.states = new ArrayList<>(automaton.states);
        this.abc = new ArrayList<>(automaton.abc);
    }

    public void setAbc(ArrayList<String> abc) {
        this.abc = abc;
    }

    public void addLetter(String letter) {
        if(!abc.contains(letter))
            abc.add(letter);
    }

    public ArrayList<String> getAbc() {
        return abc;
    }

    public void setInitState(State state) {
        initState = state;
    }

    public State getInitState() {
        return initState;
    }

    public void addState(State state) {
        states.add(state);
    }

    public ArrayList<State> getStates() { return states; }

    public State getState(String name) {
        for(State state : getStates()) {
            if(state.getName().equals(name))
                return state;
        }

        return null;
    }
    
    public int getStateCount() { return getStates().size(); }

    public void setName(String name) { this.name = name; }

    public String getName() {
        return name;
    }

    public boolean isScenarioBased() {
        return isScenarioBased;
    }

    public void setScenarioBased(boolean scenarioBased) {
        isScenarioBased = scenarioBased;
    }

    public ArrayList<String> getEveryPossibleLabelName() {
        ArrayList<String> transitionLabels = new ArrayList<>();
        transitionLabels.add("");
        for (int i = 0; i < transitionLabels.size(); i++) {
            for (String letter : abc) {
                if (!transitionLabels.get(i).contains(letter)) {
                    String temp_transitionLabel = "";
                    if (transitionLabels.get(i).equals("")) {
                        temp_transitionLabel = "(" + letter + ")";
                        transitionLabels.set(i, "(!(" + letter + "))");
                    } else {
                        temp_transitionLabel = transitionLabels.get(i) + " && (" + letter + ")";
                        transitionLabels.set(i, transitionLabels.get(i) + " && (!(" + letter + "))");
                    }
                    transitionLabels.add(temp_transitionLabel);
                }
            }
        }

        return transitionLabels;
    }
}