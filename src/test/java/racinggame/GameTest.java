package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @DisplayName("게임 시작시 시작 상태를 갖는다")
    @Test
    void testStart() {
        Game game = new Game();
        assertThat(game.getGameState()).isInstanceOf(GameStartState.class);
    }
}
