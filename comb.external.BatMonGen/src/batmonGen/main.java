package batmonGen;

import java.util.Scanner;

public class main {
    //TODO, nice to have: implement an option where the user can run a series of automated tests (easy implementation: compare log files)
    private static Logger logger;

    public static void main(String[] args) {
        int MIN_OPTION = 1;
        int MAX_OPTION = 3;

        System.out.println("   /\\                 /\\");
        System.out.println("  / \\'._   (\\_/)   _.'/ \\");
        System.out.println(" /_.''._'--('.')--'_.''._\\");
        System.out.println(" | \\_ / `;=/ \" \\=;` \\ _/ |");
        System.out.println("  \\/ `\\__|`\\___/`|__/`  \\/");
        System.out.println("   `      \\(/|\\)/       `");
        System.out.println("           \" ` \"");
        System.out.println("Art source: https://www.asciiart.eu/animals/bats\n");
        System.out.println("Welcome to the Büchi-automata to Monitor generator program, alias BaToMonGen or BatmonGen.\n");
        System.out.println("Please choose the preffered input option by typing in its number:");
        System.out.println("(Every Büchi-automata should be written in never claim.)");
        System.out.println("1)\tA Büchi-automaton which accepts runs that should happen\n"
                         + "2)\tA Büchi-automaton which accepts runs that should NOT happen (like scenario based monitoring)\n"
                         + "3)\tA Büchi-automaton and its negated counterpart \n");

        Scanner scanner_options = new Scanner(System.in);

        int inputOption = 1;
        boolean isWrongInput = true;
        while(isWrongInput) {
            while(!scanner_options.hasNextInt()) {
                scanner_options.next();
                System.out.println("Wrong input! Please type only the number of the option, then hit [ENTER].");
            }
            inputOption = scanner_options.nextInt();

            isWrongInput = MIN_OPTION > inputOption || inputOption > MAX_OPTION;
            if(isWrongInput)
                System.out.println("Wrong input! Please type only the number of the option, then hit [ENTER].");
        }
        
        scanner_options.close();

        Automaton fsm = new Automaton();
        switch(inputOption) {
            case 1:
            case 2:
                Automaton dfa = neverClaimToDFA(false);

                logger.log("\n///////////////////////////////////////////////////////////////////////////////");
                logger.log("STAGE (5/6): CREATING FSM");
                fsm = Transform.DFAtoFSM(dfa, inputOption);
                printAutomaton(fsm);
                break;

            case 3:
                Automaton dfa_original = neverClaimToDFA(false);
                Automaton dfa_negated = neverClaimToDFA(true);

                try {
                    logger.log("\n///////////////////////////////////////////////////////////////////////////////");
                    logger.log("STAGE (5/6): CREATING FSM");
                    fsm = Transform.DFAtoFSM(dfa_original, dfa_negated);
                    printAutomaton(fsm);
                }
                catch(AutomataAbcNotEqualsException aanee) {
                    logger.log("   An error occured: " + aanee.toString());
                }
                break;
        }

        logger.log("\n///////////////////////////////////////////////////////////////////////////////");
        logger.log("STAGE (6/6): GENERATING MONITOR");
        Generator.generate(fsm, logger, "the.packages.temp.name");
        logger.log("\n///////////////////////////////////////////////////////////////////////////////");

        logger.close();
    }
    
    private static Automaton readBuchi() {
        Automaton buchi = new Automaton();

        boolean wrongInput = true;
        while(wrongInput) {
            try {
                System.out.println("   Please give the path to the file which contains the never claim:");

                Scanner scanner_path = new Scanner(System.in);
                String path = scanner_path.nextLine();
                System.out.println();

                System.out.println("-------------------------------------------------------------------------------");
                buchi = NeverclaimToBuchi.parse(path);

                wrongInput = false;
                
                scanner_path.close();
            }
            catch(Exception e) {
                System.out.println("   An error occured:" + e.toString());
            }
        }

        return buchi;
    }
    
    private static Automaton neverClaimToDFA(boolean appendLogger) {
        Automaton buchi = readBuchi();
        if(logger == null)
            logger = new Logger(buchi.getName(), appendLogger);
        logger.log("\n///////////////////////////////////////////////////////////////////////////////");
        logger.log("STAGE (1/6): READ BUCHI");
        printAutomaton(buchi);
        logger.log("\n///////////////////////////////////////////////////////////////////////////////");
        logger.log("STAGE (2/6): SEARCHING FOR BAD REGIONS");
        Tarjan.markBadRegions(buchi, logger);
        logger.log("\n///////////////////////////////////////////////////////////////////////////////");
        logger.log("STAGE (3/6): CREATE NFA");
        Automaton nfa = Transform.buchiToNFA(buchi);
        printAutomaton(nfa);
        logger.log("\n///////////////////////////////////////////////////////////////////////////////");
        logger.log("STAGE (4/6): CREATE DFA");
        Automaton dfa = Transform.NFAtoDFA(nfa);
        printAutomaton(dfa);

        return dfa;
    }

    private static void printAutomaton(Automaton automaton) {
        logger.log("");

        logger.appendToLine("  Automaton ABC: ");
        for (int i = 0; i < automaton.getAbc().size(); i++) {
            logger.appendToLine(automaton.getAbc().get(i));
            if (i + 1 < automaton.getAbc().size())
                logger.appendToLine(", ");
        }
        logger.log("");

        logger.log("  Automaton name: " + automaton.getName());
        for (int i = 0; i < automaton.getStates().size(); i++) {
            State state = automaton.getStates().get(i);
            logger.appendToLine("      " + i + ".: " + (state.equals(automaton.getInitState()) ? "Init_State: " : "State: ") + "{" + state.getName() + "}" + (state.isAccepting() ? "; is accepting" : ""));
            switch (state.getSetType()) {
                case Good:
                    logger.log(" (Marked as GOOD)");
                    break;
                case Bad:
                    logger.log(" (Marked as BAD)");
                    break;
                case Inconclusive:
                    logger.log(" (Marked as inconclusive)");
                    break;
                default:
                    logger.log("");
                    break;
            }
            for (Transition transition : state.getTransitions()) {
                logger.log("          Transition: " + transition.getLabel().getName() + " -> goto " + transition.getDestinationStateName());
            }
        }
    }
}