package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {
    @Test
    void testCreateRacing() {
        CarGroup carGroup = CarGroup.create("붕붕", "마리오", "와리오", "링크");
        Racing racing = Racing.create(carGroup, 5);
        assertThat(racing.getJoinedCarSize()).isEqualTo(carGroup.size());
        assertThat(racing.getRemainRound()).isEqualTo(5);
    }
}
