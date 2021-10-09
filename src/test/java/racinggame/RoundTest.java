package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoundTest {
    @Test
    void testCreateRound() {
        Round round = new Round(5);
        assertThat(round.value()).isEqualTo(5);
    }

    @Test
    void testIsFinish() {
        Round round = new Round(0);
        assertThat(round.isFinish()).isTrue();
        round = new Round(1);
        assertThat(round.isFinish()).isFalse();
    }

    @Test
    void testDecrease() {
        Round round = new Round(5);
        round.decrease();
        assertThat(round.value()).isEqualTo(4);
    }
}
