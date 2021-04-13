package batmonGen;

import java.util.ArrayList;
import java.util.Stack;

//TODO, nice to have: Create TarjanState class
public class Tarjan {
    private static ArrayList<ArrayList<State>> sccs;

    private static Stack<State> stack;
    private static int index;

    //TODO, nice to have: It does not recognise GOOD SCCs properly when Epsilon transitions are present (see: BAs/ba_enfa_cycle.txt)
    // This is rated "nice to have" because GOOD SCCs are not required to yield a result. However by utilising them, the result could have been more accurate.
    // This issue does not effect the detection of BAD and INCONLUSIVE SCCs.
    public static void markBadRegions(Automaton buchi, Logger logger) {
        sccs = new ArrayList<>();

        stack = new Stack<>();
        index = 0;

        for(State state : buchi.getStates()) {
            if(state.getIndex() == -1) {
                strongConnect(buchi, state);
            }
        }

        for(ArrayList<State> scc : sccs) {
            logger.log("SCC:");
            for(State state : scc) {
                logger.log("   " + state.getName());
                if(state.getTransitions().size() == 0 && !state.isAccepting())
                    state.setSetType(State.SetType.Bad);
                else {
                    boolean isStateComplete = state.isStateComplete(buchi);
                    boolean everyStateIsAccepting = everyStateIsAccepting(scc);
                    boolean isAcceptingReachable = isAcceptingReachable(scc);
                    if ((!buchi.isScenarioBased() && noOutgoingTransitionExists(scc, buchi) && everyStateIsAccepting && isStateComplete) ||
                            (buchi.isScenarioBased() && isAcceptingReachable)) {
                        state.setSetType(State.SetType.Good);
                    } else if ((!buchi.isScenarioBased() && !isAcceptingReachable) ||
                            (buchi.isScenarioBased() && noOutgoingTransitionExists(scc, buchi) && everyStateIsAccepting && isStateComplete)) {
                        state.setSetType(State.SetType.Bad);
                    } else {
                        state.setSetType(State.SetType.Inconclusive);
                        break;
                    }
                }
            }

            boolean isGoodScc = false;
            boolean isBadScc = false;
            boolean isInconclusiveScc = false;
            for(State state : scc) {
                switch(state.getSetType()) {
                    case Good:
                        isGoodScc = true;
                    break;
                    case Bad:
                        isBadScc = true;
                    break;
                    case Inconclusive:
                        isInconclusiveScc = true;
                    break;
                }
            }
            for(State state : scc) {
                if(isGoodScc && !isBadScc && !isInconclusiveScc) {
                    state.setSetType(State.SetType.Good);
                }
                else if(!isGoodScc && isBadScc && !isInconclusiveScc) {
                    state.setSetType(State.SetType.Bad);
                }
                else {
                    state.setSetType(State.SetType.Inconclusive);
                }
            }
            if(isGoodScc && !isBadScc && !isInconclusiveScc) {
                logger.log("   Marked as good region!");
            }
            else if(!isGoodScc && isBadScc && !isInconclusiveScc) {
                logger.log("   Marked as bad region!");
            }
        }
    }

    private static boolean strongConnect(Automaton automaton, State v) {
        v.setIndex(index);
        v.setLowlink(index);
        index++;
        stack.push(v);
        v.setOnStack(true);
        v.setAcceptingReachable(v.isAccepting());
        boolean isAcceptingReachable = v.isAccepting();

        for(Transition transition : v.getTransitions()) {
            State w = automaton.getState(transition.getDestinationStateName());
            if(w.getIndex() == -1) {
                boolean temp_isAcceptingReachable = strongConnect(automaton, w);
                if(!isAcceptingReachable)
                    isAcceptingReachable = temp_isAcceptingReachable;

                if(!v.isAcceptingReachable())
                    v.setAcceptingReachable(isAcceptingReachable);

                v.setLowlink(Math.min(v.getLowlink(), w.getLowlink()));
            }
            else if(w.getOnStack()) {
                v.setLowlink(Math.min(v.getLowlink(), w.getIndex()));
            }
        }

        if(v.getLowlink() == v.getIndex()) {
            ArrayList<State> scc = new ArrayList<>();
            State w;
            do {
                w = stack.pop();
                w.setOnStack(false);
                scc.add(w);
            } while(!w.getName().equals(v.getName()));

            sccs.add(scc);
        }

        return isAcceptingReachable;
    }

    private static boolean everyStateIsAccepting(ArrayList<State> scc) {
        for(State state : scc) {
            if(!state.isAccepting())
                return false;
        }

        return true;
    }

    private static boolean isAcceptingReachable(ArrayList<State> scc) {
        for(State state : scc) {
            if(state.isAcceptingReachable())
                return true;
        }

        return false;
    }


    private static boolean noOutgoingTransitionExists(ArrayList<State> scc, Automaton buchi) {
        for(State state : scc) {
            for(Transition transition : state.getTransitions()) {
                if(!scc.contains(buchi.getState(transition.getDestinationStateName())))
                    return false;
            }
        }

        return true;
    }
}
