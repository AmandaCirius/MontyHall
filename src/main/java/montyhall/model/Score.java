package montyhall.model;

public class Score {
    private int stick;
    private int change;

    public Score() {
        this.stick = 0;
        this.change = 0;
    }

    public void addStick() {
        stick++;
    }

    public void addChange() {
        change++;
    }

    public int getStick() {
        return stick;
    }

    public int getChange() {
        return change;
    }

    public String getResult() {
        final String result = (stick > change) ? "stick to" : "change";
        return "You stand a better change by choosing to " + result + " your choice.";
    }
}
