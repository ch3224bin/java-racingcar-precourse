package racinggame;

import java.util.ArrayList;
import java.util.List;

public class CarGroup {
    private final List<Car> cars = new ArrayList<>();

    private CarGroup(String ... carNames) {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    public static CarGroup create(String ... carNames) {
        return new CarGroup(carNames);
    }

    public int size() {
        return cars.size();
    }

    public List<String> carNames() {
        List<String> result = new ArrayList<>();
        for (Car car : cars) {
            result.add(car.getName());
        }
        return result;
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public void injectEnergy() {
        for (Car car : cars) {
            car.inject(EnergyGenerator.createEnergy());
        }
    }
}
