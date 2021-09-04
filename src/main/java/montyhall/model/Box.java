package montyhall.model;

public class Box {
    private final boolean hasMoney;

    public Box(boolean hasMoney) {
        this.hasMoney = hasMoney;
    }

    public boolean hasMoney() {
        return hasMoney;
    }
}
