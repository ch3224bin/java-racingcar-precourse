package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameRacingStateTest {
    @Test
    void testCreateGameRacingState() {
        GameRacingState gameRacingState = new GameRacingState();
        assertThat(gameRacingState).isNotNull();
    }
}
