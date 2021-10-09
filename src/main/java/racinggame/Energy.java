package racinggame;

public class Energy {
    public static final int ENOUGH_VALUE = 4;
    private final int value;

    public Energy(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean isEnough() {
        return this.value >= ENOUGH_VALUE;
    }
}
