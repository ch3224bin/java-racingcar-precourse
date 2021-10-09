package racinggame;

public class CarNameValidationPolicy {
    private final int maxCarNameLength;

    public CarNameValidationPolicy(int maxCarNameLength) {
        this.maxCarNameLength = maxCarNameLength;
    }

    public int getCarNameLength() {
        return this.maxCarNameLength;
    }
}
