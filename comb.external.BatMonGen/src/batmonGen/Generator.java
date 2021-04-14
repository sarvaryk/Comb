package batmonGen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Generator {
    public static void generate(Automaton fsm, Logger logger) {
        //TODO: linux-on az IdeaProjects-el kene kezdenie
        String dirPath = System.getProperty("user.dir") + File.separator + "Gen" + File.separator;
        generate(fsm, logger, dirPath);
    }
    
    public static void generate(Automaton fsm, Logger logger, String dirPath) {
        try {
            File dir = new File(dirPath);
            dir.mkdirs();

            generateMQTTSubscribersClass(dir);
            generateAbstractMonitorClass(dir);
            generateMonitorComponent(fsm, dir, logger);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateMQTTSubscribersClass(File dir) throws IOException {
        String className = "MqttSubscribe";
        File actualFile = new File(dir, className + ".java");
        if(!actualFile.exists()) {
            FileWriter writer = new FileWriter(actualFile, false);

            writer.write("import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;\n" +
                    "import org.eclipse.paho.client.mqttv3.MqttAsyncClient;\n" +
                    "import org.eclipse.paho.client.mqttv3.MqttCallback;\n" +
                    "import org.eclipse.paho.client.mqttv3.MqttConnectOptions;\n" +
                    "import org.eclipse.paho.client.mqttv3.MqttException;\n" +
                    "import org.eclipse.paho.client.mqttv3.MqttMessage;\n" +
                    "import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;\n" +
                    "\n" +
                    "public class MqttSubscribe implements MqttCallback {\n" +
                    "\tprivate monitormanager monitormanager = new monitormanager();\n" +
                    "\n" +
                    "\tpublic static void main(String[] args) {\n" +
                    "\t\tString topic = \"MQTT Examples\";\n" +
                    "\t\tint qos = 2;\n" +
                    "\t\tString serverURL = \"tcp://localhost:1883\";\n" +
                    "\t\tString clientId = \"MonitorManager\";\n" +
                    "\t\tMemoryPersistence persistence = new MemoryPersistence();\n" +
                    "\n" +
                    "\t\ttry {\n" +
                    "\t\t\tMqttAsyncClient sampleClient = new MqttAsyncClient(serverURL, clientId, persistence);\n" +
                    "\t\t\tMqttConnectOptions connOpts = new MqttConnectOptions();\n" +
                    "\t\t\tconnOpts.setCleanSession(true);\n" +
                    "\t\t\tsampleClient.setCallback(new MqttSubscribe());\n" +
                    "\t\t\tSystem.out.println(\"Connecting to broker: \" + serverURL);\n" +
                    "\t\t\tsampleClient.connect(connOpts);\n" +
                    "\t\t\tSystem.out.println(\"Connected\");\n" +
                    "\t\t\tThread.sleep(1000);\n" +
                    "\t\t\tsampleClient.subscribe(topic, qos);\n" +
                    "\t\t\tSystem.out.println(\"Subscribed\");\n" +
                    "\t\t} catch (Exception me) {\n" +
                    "\t\t\tif (me instanceof MqttException) {\n" +
                    "\t\t\t\tSystem.out.println(\"reason \" + ((MqttException) me).getReasonCode());\n" +
                    "\t\t\t}\n" +
                    "\t\t\tSystem.out.println(\"msg \" + me.getMessage());\n" +
                    "\t\t\tSystem.out.println(\"loc \" + me.getLocalizedMessage());\n" +
                    "\t\t\tSystem.out.println(\"cause \" + me.getCause());\n" +
                    "\t\t\tSystem.out.println(\"excep \" + me);\n" +
                    "\t\t\tme.printStackTrace();\n" +
                    "\t\t}\n" +
                    "\t}\n" +
                    "\n" +
                    "\tpublic void connectionLost(Throwable arg0) {\n" +
                    "\t\tSystem.err.println(\"\\nconnection lost: \" + arg0.getMessage());\n" +
                    "\t}\n" +
                    "\n" +
                    "\tpublic void deliveryComplete(IMqttDeliveryToken arg0) {\n" +
                    "\t\tSystem.err.println(\"delivery complete\");\n" +
                    "\t}\n" +
                    "\n" +
                    "\tpublic void messageArrived(String topic, MqttMessage message) {\n" +
                    "\t\tSystem.out.println(\"(topic: \" + topic + \", message: \" + new String(message.getPayload()) + \")\");\n" +
                    "\n" +
                    "\t\tmonitormanager.update(new String(message.getPayload()));\n" +
                    "\t}\n" +
                    "}");

            writer.close();
        }
    }

    private static void generateAbstractMonitorClass(File dir) throws IOException {
        String className = "AbstractMonitor";
        File actualFile = new File(dir, className + ".java");
        if(!actualFile.exists()) {
            FileWriter writer = new FileWriter(actualFile, false);

            writer.write("public abstract class Monitor {\n" +
                    "\tprivate String name;\n" +
                    "\tprivate int requirementSatisfied;\n" +
                    "\tprivate boolean isActivated;\n" +
                    "\n" +
                    "\tpublic abstract int update(String signal_sequence);\n" +
                    "\n" +
                    "\tprotected abstract int goodStateReached();\n" +
                    "\n" +
                    "\tprotected abstract int badStateReached(String lastState, String lastEvent);\n" +
                    "\n" +
                    "\tpublic abstract int resetMonitor();\n" +
                    "\n" +
                    "\tprotected String getMessagePrefix() { return \"\\t\" + getName() + \": \"; }\n" +
                    "\n" +
                    "\tpublic String getName() { return name; }\n" +
                    "\n" +
                    "\tprotected void setName(String name) { this.name = name; }\n" +
                    "\n" +
                    "\tpublic int getRequirementSatisfied() { return requirementSatisfied; }\n" +
                    "\n" +
                    "\tprotected void setRequirementSatisfied(int requirementSatisfied) { this.requirementSatisfied = requirementSatisfied; }\n" +
                    "\n" +
                    "\tpublic boolean isActivated() { return isActivated; }\n" +
                    "\n" +
                    "\tpublic void setActivated(boolean activated) { isActivated = activated; }\n" +
                    "}");

            writer.close();
        }
    }

    private static void generateMonitorComponent(Automaton fsm, File dir, Logger logger) throws IOException {
        boolean isMonitorable = false;
        String className =  fsm.getName();
        File actualFile = new File(dir, className + "_monitor.java");
        FileWriter writer = new FileWriter(actualFile, false);

        writer.write("import java.util.Collections;\n" +
                "\n" +
                "public class " + className +" extends Monitor {\n" +
                "\tenum State {\n");
        for(int i = 0; i < fsm.getStates().size(); i++) {
            writer.write("\t\tState_" + i + (i < fsm.getStates().size() - 1 ? "," : "") + "\n");
        }
        writer.write("\t}\n" +
                "\tprivate State currentState;\n" +
                "\n" +
                "\t" + className + "() { resetMonitor(); }\n" +
                "\n" +
                "\t@Override\n" +
                "\tpublic int resetMonitor() {\n" +
                "\t\tthis.setRequirementSatisfied(0);\n" +
                "\t\tthis.setActivated(false);\n" +
                "\t\tthis.setName(\"" + className + "\");\n" +
                "\n");
        String initStateName = "State_" + fsm.getStates().indexOf(fsm.getInitState());
        writer.write("\t\tcurrentState = State." + initStateName + ";\n");
        int numberOfTerminatingStatesPrinted = 0;
        for(int i = 0; i < fsm.getStates().size(); i++) {
            State state = fsm.getStates().get(i);
            if(state.getSetType() == State.SetType.Bad || state.getSetType() == State.SetType.Good) {
                isMonitorable = true;
                writer.write("\t\t" + (numberOfTerminatingStatesPrinted == 0 ? "" : "else ") + "if(currentState.equals(State.State_" + i + ")) {\n" +
                        "\t\t\t" + (state.getSetType() == State.SetType.Good ? "return goodStateReached()":"return badStateReached(currentState.toString(), \"\")") + ";\n" +
                        "\t\t}\n");
                numberOfTerminatingStatesPrinted++;
            }
        }
        writer.write("\t\treturn 0;\n" +
                "\t}\n" +
                "\n" +
                "\t@Override\n" +
                "\tprotected int goodStateReached() {\n" +
                "\t\tSystem.out.println(getMessagePrefix() + \"Good state reached!\");\n" +
                "\t\tsetRequirementSatisfied(1);\n" +
                "\t\treturn 1;\n" +
                "\t}\n" +
                "\n" +
                "\t@Override\n" +
                "\tprotected int badStateReached(String lastState, String lastEvent) {\n" +
                "\t\tSystem.out.println(getMessagePrefix() + \"Bad state reached!\");\n" +
                "\t\tsetRequirementSatisfied(-1);\n" +
                "\t\treturn -1;\n" +
                "\t}\n" +
                "\n");
        writer.write("\t@Override\n" +
                "\tpublic int update(String signal_sequence) {\n" +
                "\t\tjava.util.List<String> signals = new java.util.ArrayList<>();\n" +
                "\t\tCollections.addAll(signals, signal_sequence.toLowerCase().split(\"\\\\s*;\\\\s*\"));\n" +
                "\n" +
                "\t\tboolean[] letters = new boolean[" + fsm.getAbc().size() + "];\n" +
                "\t\tSystem.out.println(getMessagePrefix() + \"State before update: \" + currentState);\n" +
                "\n" +
                "\t\tjava.util.List<String> signals_used = new java.util.ArrayList<>();\n");
        for(int i = 0; i < fsm.getAbc().size(); i++) {
            writer.write("\t\tif(signals.contains(\"" + fsm.getAbc().get(i) + "\")) {\n" +
                    "\t\t\tletters[" + i + "] = true;\n" +
                    "\t\t\tsignals_used.add(\"" + fsm.getAbc().get(i) + "\");\n" +
                    "\t\t}\n");
        }
        writer.write("\t\tSystem.out.println(getMessagePrefix() + \"Signals sent: \" + String.join(\"; \", signals));\n" +
                "\t\tSystem.out.println(getMessagePrefix() + \"Signals used: \" + String.join(\"; \", signals_used));\n" +
                "\n" +
                "\t\tint result = 0;\n" +
                "\t\tswitch(currentState) {\n");
        for(int i = 0; i < fsm.getStates().size(); i++) {
            writer.write("\t\t\tcase State_" + i + ":\n" +
                    "\t\t\t\tresult = State_" + i + "(letters, signal_sequence);\n" +
                    "\t\t\t\tbreak;\n");
        }
        writer.write("\t\t}\n" +
                "\t\tSystem.out.println(getMessagePrefix() + \"State after update: \" + currentState + \"\\n\");\n" +
                "\n" +
                "\t\treturn result;\n" +
                "\t}\n" +
                "\n");

        for(int i = 0; i < fsm.getStates().size(); i++) {
            State state = fsm.getStates().get(i);
            writer.write("\tprivate int State_" + i + "(boolean[] letters, String signal_sequence) {\n");
            int numberOfPrints = (state.getSetType()==State.SetType.Good || state.getSetType()==State.SetType.Bad) ? 1 : state.getTransitions().size();
            for(int j = 0; j < numberOfPrints; j++) {
                Transition transition = state.getTransitions().get(j);
                State destinationState = fsm.getState(transition.getDestinationStateName());

                if(state.getSetType() == State.SetType.Inconclusive) {
                    String label = transition.getLabel().getReduced_name();

                    for (int k = 0; k < fsm.getAbc().size(); k++) {
                        label = label.replaceAll("x" + (k + 1), "letters[" + k + "]");
                    }
                    if(label != null)
                        label = label.replace("NOT", "!");
                    writer.write("\t\t" + (j == 0 ? "" : "else ") + "if(" + (label != null ? label: true) + ")");

                    if(destinationState.getSetType() == State.SetType.Good || destinationState.getSetType() == State.SetType.Bad)
                        writer.write(" {");

                    writer.write("\n\t\t\tcurrentState = State.State_" + fsm.getStates().indexOf(destinationState) + ";\n");
                }

                if(state.getSetType() == State.SetType.Good || destinationState.getSetType() == State.SetType.Good)
                    writer.write("" +
                            "\t\t\treturn goodStateReached();\n");
                else if(state.getSetType() == State.SetType.Bad || destinationState.getSetType() == State.SetType.Bad)
                    writer.write("" +
                            "\t\t\treturn badStateReached(currentState.toString(), signal_sequence);\n");

                if((state.getSetType() == State.SetType.Inconclusive) && (destinationState.getSetType() == State.SetType.Good || destinationState.getSetType() == State.SetType.Bad))
                    writer.write("\t\t}\n");
            }

            if(state.getSetType() == State.SetType.Inconclusive)
                writer.write("\n\t\treturn 0;\n");

            writer.write("\t}\n" +
                    "\n");
        }

        writer.write("}");
        writer.close();

        if(logger != null) {
	        if(isMonitorable)
	            logger.log("\n\tThe monitor may eventually yield a verdict!");
	        else
	            logger.log("\n\tThe monitor will always return \"Inconclusive\"!" +
	                    "\n\tIt has no \"Good\" or \"Bad\" states!");
        }
    }
}
