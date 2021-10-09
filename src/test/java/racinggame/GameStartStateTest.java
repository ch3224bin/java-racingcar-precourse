package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameStartStateTest {
    @Test
    void testPrint() {
        View view = new GameStartState().getView();
        assertThat(view).isEqualTo(View.Q_CAR_NAME);
    }
}
