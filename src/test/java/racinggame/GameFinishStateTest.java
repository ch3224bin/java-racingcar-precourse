package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameFinishStateTest {
    @Test
    void testView() {
        assertThat(new GameFinishState().getView()).isEqualTo(View.RACING_FINISH);
    }
}
