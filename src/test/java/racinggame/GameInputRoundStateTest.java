package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GameInputRoundStateTest {
    private Game game;

    @BeforeEach
    void setUp() {
        this.game = new Game();
        game.setGameState(new GameInputRoundState());
    }

    @Test
    void testInputRound() {
        game.getGameState().process(() -> "5", game);
        assertThat(game.getRound().value()).isEqualTo(5);
    }

    @Test
    void testValidation() {
        assertThatThrownBy(() -> game.getGameState().process(() -> "a", game))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testPrint() {
        View view = new GameInputRoundState().getView();
        assertThat(view).isEqualTo(View.Q_ROUND);
    }

    @DisplayName("라운드 횟수를 입력하면 다음 스테이터스로 이동한다")
    @Test
    void testNextStep() {
        game.getGameState().process(() -> "5", game);
        assertThat(game.getGameState()).isInstanceOf(GameRacingState.class);
    }
}
