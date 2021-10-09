package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CarNameGeneratorTest {

    @DisplayName("CarName을 생성한다")
    @Test
    void testCreateCarName() {
        CarName carName = CarNameGenerator.createCarName("붕붕", new CarNameValidationPolicy(5));
        assertThat(carName).isEqualTo(new CarName("붕붕"));
    }

    @DisplayName("주어진 조건에 맞는 CarName을 생성한다")
    @Test
    void testCreateCarNameValidation() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> CarNameGenerator.createCarName("", new CarNameValidationPolicy(5)));
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> CarNameGenerator.createCarName("abcdef", new CarNameValidationPolicy(5)));
    }
}
