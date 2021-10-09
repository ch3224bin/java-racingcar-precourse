package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarNameValidationPolicyTest {
    @Test
    void testNew() {
        CarNameValidationPolicy carNameValidationPolicy = new CarNameValidationPolicy(5);
        assertThat(carNameValidationPolicy.getCarNameLength()).isEqualTo(5);
    }
}
