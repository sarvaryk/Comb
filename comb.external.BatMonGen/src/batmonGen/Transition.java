package batmonGen;

public class Transition {
    private String destinationStateName;
    private Label label;

    public void setDestinationStateName(String destinationStateName) { this.destinationStateName = destinationStateName; }

    public String getDestinationStateName() {
        return destinationStateName;
    }

    public void setLabel(Label label) { this.label = label; }

    public Label getLabel() {
        return label;
    }

}