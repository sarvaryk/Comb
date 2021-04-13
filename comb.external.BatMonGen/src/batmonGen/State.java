package batmonGen;
import java.util.ArrayList;

public class State {
	public static String EMPTY = "Empty_State";
	
    public enum SetType {
        Good,           //Every continuation is accepted
        Bad,            //No accepting state can be reached from a bad state
        Inconclusive    //We know that an accepting as well as a bad state can be reached
    }

    private String name;
    private SetType setType = SetType.Inconclusive;
    private boolean isAccepting = false;
    private ArrayList<Transition> transitions = new ArrayList<>();

    private int index = -1;
    private int lowlink = -1;
    private boolean onStack;
    private boolean isAcceptingReachable;

    public State() {
        
    }

    public State(String name) {
        this.setName(name);
    }

    public State(State state) {
        name = state.getName();
        setType = state.getSetType();
        isAccepting = state.isAccepting();
        transitions = state.getTransitions();
    }

    public boolean isStateComplete(Automaton automaton) {
        for(String transitionLabelNames : automaton.getEveryPossibleLabelName()) {
            boolean isLabelSatisfied = false;
            Label temp_label = new Label(transitionLabelNames, automaton.getAbc());
            for(int j = 0; j < transitions.size(); j++) {
                Transition transition = transitions.get(j);
                if(transition.getLabel().satisfies(temp_label)) {
                    isLabelSatisfied = true;
                    break;
                }
            }

            if(!isLabelSatisfied) {
                return false;
            }
        }

        return true;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setLowlink(int lowlink) {
        this.lowlink = lowlink;
    }

    public int getLowlink() {
        return lowlink;
    }

    public void setOnStack(boolean onStack) {
        this.onStack = onStack;
    }

    public boolean getOnStack() {
        return onStack;
    }

    public boolean isAcceptingReachable() { return isAcceptingReachable; }

    public void setAcceptingReachable(boolean acceptingReachable) { isAcceptingReachable = acceptingReachable; }

    public void setSetType(SetType setType) {
        this.setType = setType;
    }

    public SetType getSetType() {
        return setType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccepting(boolean isAccepting) {
        this.isAccepting = isAccepting;
    }

    public boolean isAccepting() {
        return isAccepting;
    }

    public void addTransition(Transition transition) {
        transitions.add(transition);
    }

    public ArrayList<Transition> getTransitions() {
        return transitions;
    }
}