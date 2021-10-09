package racinggame;

import nextstep.utils.Randoms;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

public class RacingTest {

    private CarGroup carGroup;

    @BeforeEach
    void setUp() {
        carGroup = CarGroup.create("붕붕", "마리오", "와리오", "링크");
    }

    @Test
    void testCreateRacing() {
        Racing racing = Racing.create(carGroup, 5);
        assertThat(racing.getJoinedCarSize()).isEqualTo(carGroup.size());
        assertThat(racing.getRemainRound()).isEqualTo(5);
    }

    @DisplayName("각 라운드 마다 자동차에 에너지를 주입한다")
    @Test
    void testInectEnergyEachRound() {
        int round = 20;
        Racing racing = Racing.create(carGroup, round);
        // 20회 동안 가다 서다를 반복한다
        for (int i = 0, distance = 0; i < round; i++) {
            int energy = i % 2 == 0 ? 4 : 3;
            distance += energy == 4 ? 1 : 0;
            try (final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class)) {
                mockRandoms.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                        .thenReturn(energy);
                RoundResult roundResult = racing.play();
                assertThat(roundResult.getCars()).hasSize(4);
                assertThat(roundResult.getCars().get(0).getDistance()).isEqualTo(distance);
            }
        }
    }
}
