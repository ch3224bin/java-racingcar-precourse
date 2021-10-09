package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EnergyGeneratorTest {
    @Test
    void testCreateEnergy() {
        for (int i = 0; i < 1000; i++) {
            Energy energy = EnergyGenerator.createEnergy();
            assertThat(energy.value()).isGreaterThan(-1).isLessThan(10);
        }
    }
}
