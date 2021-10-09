package racinggame;

public class Car {
    public static final int CAR_NAME_MAX_LENGTH = 5;
    private final CarName name;

    public Car(String name) {
        this.name = CarNameGenerator.createCarName(name, new CarNameValidationPolicy(CAR_NAME_MAX_LENGTH));
    }

    public String getName() {
        return this.name.value();
    }
}
