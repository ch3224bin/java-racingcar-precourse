package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CarTest {

    @DisplayName("이름을 가진 자동차를 생성한다")
    @Test
    void testCreateCar() {
        assertThat(new Car("붕붕이").getName()).isEqualTo("붕붕이");
    }

    @DisplayName("자동차는 5자 이하의 이름을 가진다")
    @Test
    void testValidateCarName() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> new Car(""));
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> new Car("abcdef"));
    }
}
