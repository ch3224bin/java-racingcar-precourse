package racinggame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RoundResult {
    private final List<Car> cars;

    public RoundResult(List<Car> cars) {
        List<Car> newCars = new ArrayList<>();
        for (Car car : cars) {
            newCars.add(car.copy());
        }
        this.cars = Collections.unmodifiableList(newCars);
    }

    public List<Car> getCars() {
        return this.cars;
    }
}
