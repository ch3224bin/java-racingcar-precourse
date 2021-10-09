package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GameInputRoundStateTest {
    @Test
    void testInputRound() {
        Game game = new Game();
        GameInputRoundState gameInputRoundState = new GameInputRoundState();
        game.setGameState(gameInputRoundState);
        gameInputRoundState.process("5", game);
        assertThat(game.getRound().value()).isEqualTo(5);
    }

    @Test
    void testValidation() {
        Game game = new Game();
        GameInputRoundState gameInputRoundState = new GameInputRoundState();
        game.setGameState(gameInputRoundState);
        assertThatThrownBy(() -> game.getGameState().process("a", game))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testPrint() {
        View view = new GameInputRoundState().getView();
        assertThat(view).isEqualTo(View.Q_ROUND);
    }
}
