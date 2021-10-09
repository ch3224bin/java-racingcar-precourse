package racinggame;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RoundResultTest {
    @Test
    void testCreteRoundResult() {
        List<Car> cars = Arrays.asList(new Car("1"), new Car("2"), new Car("3"), new Car("4"));
        RoundResult roundResult = new RoundResult(cars);
        assertThat(roundResult.getCars()).hasSize(cars.size()).containsAll(cars);
    }
}
