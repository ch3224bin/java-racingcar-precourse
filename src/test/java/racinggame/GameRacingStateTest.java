package racinggame;

import nextstep.utils.Randoms;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

public class GameRacingStateTest {
    private Game game;

    @BeforeEach
    void setUp() {
        this.game = new Game();
        game.setGameState(new GameRacingState());
    }

    @Test
    void testCreateGameRacingState() {
        assertThat(game.getGameState()).isNotNull();
    }

    @Test
    void testRacingResult() {
        game.setRacing(new Racing(CarGroup.create("123", "456", "789"), new Round(2)));
        try (final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class)) {
            mockRandoms.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                    .thenReturn(4, 3, 4, 4, 4, 4);
            ResultView resultView = game.getGameState().process(() -> "", game);
            assertThat(game.getRacing().isFinish()).isTrue();
            assertThat(resultView.getMessage()).isEqualTo("123 : -\n456 : \n789 : -\n\n123 : --\n456 : -\n789 : --\n\n최종 우승자는 123,789 입니다.");
        }
    }
}
