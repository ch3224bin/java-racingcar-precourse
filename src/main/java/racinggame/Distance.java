package racinggame;

public class Distance {
    private int value;

    public Distance() {}

    public Distance(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public Distance copy() {
        return new Distance(this.value);
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
