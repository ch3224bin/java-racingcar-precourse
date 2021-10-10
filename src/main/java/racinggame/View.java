package racinggame;

import java.util.List;

public enum View {
    Q_CAR_NAME ("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    Q_ROUND("시도할 회수는 몇회인가요?"),
    GAME_REPORT("%s : %s"),
    RACING_START("실행 결과");

    private final String message;

    View(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessage(RoundResults roundResults) {
        List<String> result = roundResults.getDrivingRecords();
        String drivingRecord = String.join("\n", result);
        String winners = String.format("최종 우승자는 %s 입니다.", roundResults.getWinners());
        return drivingRecord + "\n" + winners;
    }
}
