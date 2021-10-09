package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarNameTest {
    @Test
    void testCreateCarName() {
        CarName carName = new CarName("붕붕");
        assertThat(carName.value()).isEqualTo("붕붕");
    }
}
