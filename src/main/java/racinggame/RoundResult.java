package racinggame;

import java.util.*;

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

    public List<String> getWinners() {
        Map<Integer, List<String>> record = new HashMap<>();
        int highScore = 0;
        for (Car car : cars) {
            highScore = Math.max(highScore, car.getDistance());
            List<String> carNames = record.getOrDefault(car.getDistance(), new ArrayList<>());
            carNames.add(car.getName());
            record.put(car.getDistance(), carNames);
        }
        return record.get(highScore);
    }
}
