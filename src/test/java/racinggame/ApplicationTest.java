package racinggame;

import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ApplicationTest extends NSTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    private static final String ERROR_MESSAGE = "[ERROR]";

    @BeforeEach
    void beforeEach() {
        setUp();
    }

    @Test
    void 전진_정지() {
        assertRandomTest(() -> {
            run("pobi,woni", "1");
            verify("pobi : -", "woni : ", "최종 우승자는 pobi 입니다.");
        }, MOVING_FORWARD, STOP);
    }

    @Test
    void 이름에_대한_예외_처리() {
        assertSimpleTest(() -> {
            runNoLineFound("pobi,javaji");
            verify(ERROR_MESSAGE);
        });
    }

    @DisplayName("게임 시작시 경주할 자동차의 이름을 묻는다")
    @Test
    void testStart() {
        assertSimpleTest(() -> {
            runNoLineFound();
            verify("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        });
    }

    @DisplayName("시도할 횟수를 묻는다")
    @Test
    void testInputRound() {
        assertSimpleTest(() -> {
            runNoLineFound("123,456");
            verify("시도할 회수는 몇회인가요?");
        });
    }

    @DisplayName("시도할 횟수 입력에 대한 예외 처리")
    @Test
    void testValidateRound() {
        assertSimpleTest(() -> {
            runNoLineFound("pobi,javaji", "a");
            verify(ERROR_MESSAGE);
        });
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
