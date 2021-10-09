package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoundTest {
    @Test
    void testCreateRound() {
        Round round = new Round(5);
        assertThat(round.value()).isEqualTo(5);
    }
}
