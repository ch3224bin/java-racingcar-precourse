package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GameStartStateTest {
    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void testPrint() {
        View view = new GameStartState().getView();
        assertThat(view).isEqualTo(View.Q_CAR_NAME);
    }

    @Test
    void testCreateCarGroup() {
        List<String> carNames = Arrays.asList("abc", "edf", "ggg");
        game.getState().process(String.join(",", carNames), game);
        assertThat(game.getCarGroup()).isNotNull();
        assertThat(game.getCarGroup().size()).isEqualTo(3);
        assertThat(game.getCarGroup().carNames()).containsAll(carNames);
    }

    @Test
    void testValidateCarNameOverLength() {
        List<String> carNames = Arrays.asList("abc134", "edf", "ggg");
        assertThatThrownBy(() -> game.getState().process(String.join(",", carNames), game))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testValidateCarNameEmpty() {
        List<String> carNames = Arrays.asList("abc134", " ", "ggg");
        assertThatThrownBy(() -> game.getState().process(String.join(",", carNames), game))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
