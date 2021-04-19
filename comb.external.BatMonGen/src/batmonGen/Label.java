package batmonGen;

import ROBDD.src.ROBDD;

import java.util.ArrayList;
import java.util.List;

public class Label {
	public static String TRUE = "(true)";
	public static String EPSILON = "(epsilon)";
	
    private String name;
    private ROBDD robdd;
    private List<String> truthAssignments;
    private String reduced_name;
    
    public Label(String name, ArrayList<String> abc) {
        this.name = name;
        //Guard, so it wont try to generate an robdd if the abc is empty
        this.truthAssignments = new ArrayList<>();
        if (!abc.isEmpty() && !name.equals(EPSILON)) {
        	if(name.equals(TRUE)) {
                for(int i = 0; i < Math.pow(2, abc.size()); i++) {
                    String binaryString = Integer.toBinaryString(i);
                    while(binaryString.length() < abc.size()) {
                        binaryString = "0"+binaryString;
                    }
                    truthAssignments.add(binaryString);
        		}
        	}
        	else {
	            generateRobdd(abc);
	            truthAssignments = robdd.getCompleteTruthAssignments();
        	}
        }
    }

    public String getName() { return name; }

    private List<String> getTruthAssignments() { return truthAssignments; }

    public String getReduced_name() { return reduced_name; }

    private void generateRobdd(ArrayList<String> abc) {
        List<String> reduced_abc = new ArrayList<>(abc);

        reduced_name = name;
        for(int i = 0; i < abc.size(); i++) {
            reduced_abc.set(i, "x" + (i + 1));
            reduced_name = reduced_name.replace(abc.get(i), reduced_abc.get(i));
        }
        reduced_name = reduced_name.replace("!", "NOT");

        robdd = new ROBDD(reduced_abc);
        robdd.build(reduced_name, 1);
    }

    public boolean satisfies(Label label) {
        return this.getTruthAssignments().containsAll(label.getTruthAssignments());
    }
}
