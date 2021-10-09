package racinggame;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarGroupTest {
    @Test
    void testCreateCarGroup() {
        String[] carNames = {"붕붕", "마리오", "루이지", "쿠파"};
        CarGroup carGroup = CarGroup.create(carNames);
        assertThat(carGroup.size()).isEqualTo(4);
        assertThat(carGroup.carNames()).containsAll(Arrays.asList(carNames));
    }
}
