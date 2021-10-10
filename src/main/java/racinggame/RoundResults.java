package racinggame;

import java.util.ArrayList;
import java.util.List;

public class RoundResults {
    private final List<RoundResult> roundResults;

    public RoundResults(List<RoundResult> roundResults) {
        this.roundResults = roundResults;
    }

    public List<String> getDrivingRecords() {
        List<String> result = new ArrayList<>();
        for (RoundResult roundResult : roundResults) {
            List<Car> cars = roundResult.getCars();
            addRoundResult(result, cars);
            result.add("");
        }
        return result;
    }

    private void addRoundResult(List<String> result, List<Car> cars) {
        for (Car car : cars) {
            result.add(String.format("%s : %s", car.getName(), makeBars(car.getDistance())));
        }
    }

    private String makeBars(int max) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

    public String getWinners() {
        RoundResult lastRound = roundResults.get(roundResults.size() - 1);
        return String.join(",", lastRound.getWinners());
    }
}
