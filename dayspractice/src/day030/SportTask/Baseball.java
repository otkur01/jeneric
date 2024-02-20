package day030.SportTask;

public class Baseball extends Sport {
    private  int numberOfOuts;

    public Baseball(String name, int numberOfPlayers, int numberOfReferre, String rules, int numberOfOuts) {
        super(name, numberOfPlayers, numberOfReferre, rules);
        setNumberOfOuts(numberOfOuts);
    }

    public int getNumberOfOuts() {
        return numberOfOuts;
    }

    public void setNumberOfOuts(int numberOfOuts) {
        this.numberOfOuts = numberOfOuts;
    }


}
