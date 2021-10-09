package racinggame;

public class Car {
    public static final int CAR_NAME_MAX_LENGTH = 5;
    private final CarName name;
    private final Distance distance;

    public Car(String name) {
        this.name = CarNameGenerator.createCarName(name, new CarNameValidationPolicy(CAR_NAME_MAX_LENGTH));
        this.distance = new Distance();
    }

    public String getName() {
        return this.name.value();
    }

    public void inject(Energy energy) {
        if (energy.isEnough()) {
            distance.increase();
        }
    }

    public int getDistance() {
        return this.distance.value();
    }
}
