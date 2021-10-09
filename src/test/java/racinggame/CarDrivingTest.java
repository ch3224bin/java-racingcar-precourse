package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("자동차의 전진 테스트")
public class CarDrivingTest {

    @DisplayName("4 이상의 에너지를 주입 받으면 자동차는 전진한다")
    @Test
    void testDrive() {
        Car car = new Car("붕붕");
        car.inject(new Energy(4));
        assertThat(car.getDistance()).isEqualTo(1);
        car.inject(new Energy(9));
        assertThat(car.getDistance()).isEqualTo(2);
        car.inject(new Energy(3));
        assertThat(car.getDistance()).isEqualTo(2);
    }
}
