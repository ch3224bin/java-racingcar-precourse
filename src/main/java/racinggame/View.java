package racinggame;

import java.util.ArrayList;
import java.util.List;

public enum View {
    Q_CAR_NAME ("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    Q_ROUND("시도할 회수는 몇회인가요?"),
    GAME_REPORT("%s : %s"),
    RACING_START("실행 결과"),
    RACING_FINISH("최종 우승자는 %s 입니다.");

    private final String message;

    View(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessage(List<RoundResult> roundResults) {
        List<String> result = new ArrayList<>();
        for (RoundResult roundResult : roundResults) {
            List<Car> cars = roundResult.getCars();
            addRoundResult(result, cars);
            result.add("");
        }
        return String.join("\n", result);
    }

    private void addRoundResult(List<String> result, List<Car> cars) {
        for (Car car : cars) {
            result.add(String.format(this.message, car.getName(), makeBars(car.getDistance())));
        }
    }

    private String makeBars(int max) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
