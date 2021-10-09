package racinggame;

public class Round {
    private final int value;

    public Round(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean isFinish() {
        return this.value == 0;
    }
}
