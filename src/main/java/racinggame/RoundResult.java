package racinggame;

import java.util.List;

public class RoundResult {
    private final List<Car> cars;
    private final Round round;

    public RoundResult(List<Car> cars, Round round) {
        this.cars = cars;
        this.round = round;
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public boolean isRoundOver() {
        return this.round.isFinish();
    }
}
