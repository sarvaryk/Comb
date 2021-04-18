package batmonGen;

import batmonGen.State.SetType;

import java.util.*;

public class Transform {
    public static Automaton buchiToNFA(Automaton automaton) {
        for(State state : automaton.getStates()) {
            if(state.getSetType() != State.SetType.Bad)
                state.setAccepting(true);
        }
        
        /*if(automaton.getStates().size() == 1 && automaton.getStates().get(0).isAccepting())
        	automaton.getStates().get(0).setSetType(SetType.Good);*/

        return automaton;
    }

    public static Automaton NFAtoDFA(Automaton nfa) {
        Automaton dfa = new Automaton();
        dfa.setAbc(nfa.getAbc());
        dfa.setName(nfa.getName());
        dfa.setScenarioBased(nfa.isScenarioBased());

        String dfaInitStateName = getInitStateName(nfa);

        //Create every possible state
        for(int i = 0; i < Math.pow(2, nfa.getStates().size()); i++) {
            String binaryString = Integer.toBinaryString(i);
            while(binaryString.length() < nfa.getStates().size()) {
                binaryString = "0"+binaryString;
            }

            List<String> tempStateNames = new ArrayList<>();
            for(int j = 0; j < nfa.getStates().size(); j++) {
                char bit = binaryString.toCharArray()[j];
                if(bit == '1')
                    tempStateNames.add(nfa.getStates().get(j).getName());
            }
            Collections.sort(tempStateNames);
            String tempStateName = String.join("$", tempStateNames);

            State state = new State();
            if(i == 0) {
                state.setName(State.EMPTY);
                state.setAccepting(dfa.isScenarioBased());
                state.setSetType(dfa.isScenarioBased() ? SetType.Good : SetType.Bad);
            }
            else {
                state.setName(tempStateName);
                state.setAccepting(evaluateAccepting(state, nfa));
                state.setSetType(evaluateSetType(state, nfa));
            }
            
            dfa.addState(state);

            if(tempStateName.equals(dfaInitStateName))
                dfa.setInitState(state);
        }

        ArrayList<String> transitionLabels = nfa.getEveryPossibleLabelName();

        for(String labelName : transitionLabels) {
            Label label = new Label(labelName, nfa.getAbc());
            for (State state : dfa.getStates()) {
                Set<String> destinationStateNames = new HashSet<>();
                for (String tempState : state.getName().split("[$]")) {
                    if (!tempState.equals(State.EMPTY)) {
                        for (Transition transition : nfa.getState(tempState).getTransitions()) {
                            if (transition.getLabel().satisfies(label)) {
                                destinationStateNames.add(transition.getDestinationStateName());
                                destinationStateNames.addAll(getDestinationStatesOfEpsilonStatesForLabel(nfa.getState(transition.getDestinationStateName()), nfa));
                            }
                        }
                    }
                }

                Transition transition = new Transition();
                transition.setLabel(label);
                if (destinationStateNames.isEmpty())
                    transition.setDestinationStateName(State.EMPTY);
                else {
                    List<String> destinationStateNames_list = new ArrayList<>();
                    destinationStateNames_list.addAll(destinationStateNames);
                    Collections.sort(destinationStateNames_list);
                    transition.setDestinationStateName(String.join("$", destinationStateNames_list));
                }
                state.addTransition(transition);
            }
        }

        removeUnreachableStates(dfa);
        return dfa;
    }

    public static Automaton DFAtoFSM(Automaton automaton, int inputOption) {
        if(inputOption == 1) {
            //Everything remains the same
        }
        else if(inputOption == 2) {
            for(State state : automaton.getStates()) {
                if(state.getSetType() == State.SetType.Good) {
                    state.setSetType(State.SetType.Bad);
                }
                else if(state.getSetType() == State.SetType.Bad) {
                    state.setSetType(State.SetType.Good);
                }
            }
        }

        removeUnreachableStates(automaton);
        return automaton;
    }

    //Product-automaton
    public static Automaton DFAtoFSM(Automaton dfa_original, Automaton dfa_negated) throws AutomataAbcNotEqualsException {
        Automaton fsm = new Automaton();
        fsm.setName(dfa_original.getName());
        if(!dfa_original.getAbc().containsAll(dfa_negated.getAbc()) && dfa_negated.getAbc().containsAll(dfa_original.getAbc())) {
            throw new AutomataAbcNotEqualsException("The ABC of the two provided automaton differs!");
        }
        else {
            fsm.setAbc(dfa_original.getAbc());
        }

        ArrayList<Transition> transitions = new ArrayList<>();
        for(State dfa_original_state : dfa_original.getStates()) {
            for(Transition transition : dfa_original_state.getTransitions()) {
                if(!transitions.contains(transition)) {
                    transitions.add(transition);
                }
            }
        }
        for(State dfa_negated_state : dfa_negated.getStates()) {
            for(Transition transition : dfa_negated_state.getTransitions()) {
                if(!transitions.contains(transition)) {
                    transitions.add(transition);
                }
            }
        }

        for(State dfa_original_state : dfa_original.getStates()) {
            for(State dfa_negated_state : dfa_negated.getStates()) {
                State state = new State();

                state.setName(dfa_original_state.getName() + "$" + dfa_negated_state.getName());

                if(dfa_negated_state.getSetType().equals(State.SetType.Bad)) {
                    state.setSetType(State.SetType.Good);
                }
                else if(dfa_original_state.getSetType().equals(State.SetType.Bad)) {
                    state.setSetType(State.SetType.Bad);
                }
                else if((dfa_original_state.getSetType().equals(State.SetType.Good) || dfa_original_state.getSetType().equals(State.SetType.Inconclusive)) &&
                        (dfa_negated_state.getSetType().equals(State.SetType.Good) || dfa_negated_state.getSetType().equals(State.SetType.Inconclusive))) {
                    state.setSetType(State.SetType.Inconclusive);
                }

                if(dfa_original.getInitState().equals(dfa_original_state) && dfa_negated.getInitState().equals(dfa_negated_state)) {
                    fsm.setInitState(state);
                }

                for(Transition tempTransition : transitions) {
                    Transition transition1 = getTransitionByLabel(dfa_original_state, tempTransition.getLabel());
                    Transition transition2 = getTransitionByLabel(dfa_negated_state,  tempTransition.getLabel());
                    if(transition1 != null && transition2 != null && getTransitionByLabel(state, tempTransition.getLabel()) == null) {
                        Transition transition = new Transition();
                        transition.setLabel(new Label(tempTransition.getLabel().getName(), dfa_original.getAbc()));
                        transition.setDestinationStateName(transition1.getDestinationStateName() + "$" + transition2.getDestinationStateName());
                        state.addTransition(transition);
                    }
                }

                fsm.addState(state);
            }
        }

        removeUnreachableStates(fsm);
        return fsm;
    }

    private static Set<String> getDestinationStatesOfEpsilonStatesForLabel(State state, /*Label label,*/ Automaton automaton) {
        Set<String> destinationStateNames = new HashSet<>();
        destinationStateNames.addAll(reachableViaEpsilon(state, automaton, new HashSet<>()));

        //Ezt a kodot egyszer csak itt talaltam, mert hibat okozott... Kikommentezve jonak tunik, de nem tudom, hogy eredetileg miert volt itt...
        /*Set<String> temp_destinationStateNames = new HashSet<>();
        for(String tempState : destinationStateNames) {
            for(Transition transition : automaton.getState(tempState).getTransitions()) {
                if(transition.getLabel().satisfies(label))
                    temp_destinationStateNames.add(transition.getDestinationStateName());
            }
        }
        destinationStateNames.addAll(temp_destinationStateNames);*/

        return destinationStateNames;
    }

    private static Set<String> reachableViaEpsilon(State state, Automaton automaton, Set<String> reachableStateNames) {
        if (!reachableStateNames.contains(state.getName())) {
            reachableStateNames.add(state.getName());
            for (Transition transition : automaton.getState(state.getName()).getTransitions()) {
                if (transition.getLabel().getName().equals(Label.EPSILON)) {
                    State epsilonState = automaton.getState(transition.getDestinationStateName());
                    reachableStateNames.addAll(reachableViaEpsilon(epsilonState, automaton, reachableStateNames));
                }
            }

            return reachableStateNames;
        }

        return new HashSet<>();
    }

    //TODO, nice to have: would be nice to implement a proper automaton minimization (which merges states and transitions)
    private static void removeUnreachableStates(Automaton automaton) {
        List<String> reachableStates = new ArrayList<>();
        reachableStates.add(automaton.getInitState().getName());

        for(int i = 0; i < reachableStates.size(); i++) {
            for(Transition transition : automaton.getState(reachableStates.get(i)).getTransitions()) {
                if(!reachableStates.contains(transition.getDestinationStateName())) {
                    reachableStates.add(transition.getDestinationStateName());
                }
            }
        }

        List<State> statesToRemove = new ArrayList<>();
        for(State state : automaton.getStates()) {
            if(!reachableStates.contains(state.getName()) ) {
                statesToRemove.add(state);
            }
        }
        automaton.getStates().removeAll(statesToRemove);
    }

    private static String getInitStateName(Automaton automaton) {
        Set<String> reachableFromInitWithEpsilon = new HashSet<>();
        reachableFromInitWithEpsilon.add(automaton.getInitState().getName());
        reachableFromInitWithEpsilon.addAll(reachableViaEpsilon(automaton.getInitState(), automaton, new HashSet<>()));

        List<String> temp_reachableFromInitWithEpsilon = new ArrayList<>(reachableFromInitWithEpsilon);
        Collections.sort(temp_reachableFromInitWithEpsilon);

        return String.join("$", temp_reachableFromInitWithEpsilon);
    }

    private static boolean evaluateAccepting(State state, Automaton automaton) {
        for(String stateName : state.getName().split("[$]")) {
            if(automaton.getState(stateName).isAccepting())
                return true;
        }

        return false;
    }

    private static SetType evaluateSetType(State state, Automaton automaton) {
        boolean isGood = false;
        boolean isBad = false;
        boolean isInconclusive = false;
        for(String stateName : state.getName().split("[$]")) {
            switch(automaton.getState(stateName).getSetType()) {
                case Good:
                    isGood = true;
                    break;
                case Bad:
                    isBad = true;
                    break;
                default:
                    isInconclusive = true;
                    break;
            }
        }

        if(isGood && !isBad && !isInconclusive) {
            return SetType.Good;
        }
        else if((!isGood && isBad && !isInconclusive) ||
                (automaton.isScenarioBased() && isBad)) {
            return SetType.Bad;
        }
        else {
            return SetType.Inconclusive;
        }
    }

    private static Transition getTransitionByLabel(State state, Label label) {
        for(Transition transition : state.getTransitions()) {
            if(transition.getLabel().satisfies(label))
                return transition;
        }

        return null;
    }
}
