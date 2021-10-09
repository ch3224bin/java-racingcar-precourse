package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DistanceTest {
    Distance distance;

    @BeforeEach
    void setUp() {
        distance = new Distance();
    }

    @Test
    void testCreateDistance() {
        Distance distance = new Distance();
        assertThat(distance.value()).isEqualTo(0);
    }

    @Test
    void testIncreaseDistance() {
        Distance distance = new Distance();
        distance.increase();
        assertThat(distance.value()).isEqualTo(1);
    }
}
