package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RoundResultsTest {
    private RoundResults roundResults;

    @BeforeEach
    void setUp() {
        List<Car> cars = Arrays.asList(new Car(new CarName("1"), new Distance(1)),
                new Car(new CarName("2"), new Distance(0)),
                new Car(new CarName("3"), new Distance(0)),
                new Car(new CarName("4"), new Distance(1)));
        List<RoundResult> source = Arrays.asList(new RoundResult(cars));
        roundResults = new RoundResults(source);
    }

    @Test
    void testGetDrivingRecords() {
        assertThat(roundResults.getDrivingRecords()).containsAll(Arrays.asList("1 : -", "2 : ", "3 : ", "4 : -", ""));
    }

    @Test
    void getWinners() {
        assertThat(roundResults.getWinners()).isEqualTo("1,4");
    }
}
