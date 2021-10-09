package racinggame;

import nextstep.utils.Randoms;

public class EnergyGenerator {
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 9;

    public static Energy createEnergy() {
        return new Energy(Randoms.pickNumberInRange(MIN_VALUE, MAX_VALUE));
    }
}
