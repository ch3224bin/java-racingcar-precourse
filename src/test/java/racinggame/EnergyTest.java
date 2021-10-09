package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EnergyTest {

    @DisplayName("에너지를 생성한다")
    @Test
    void testCreateEnergy() {
        assertThat(new Energy(1).value()).isEqualTo(1);
        assertThat(new Energy(9).value()).isEqualTo(9);
    }
}
