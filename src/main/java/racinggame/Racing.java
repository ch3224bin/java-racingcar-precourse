package racinggame;

public class Racing {
    private final CarGroup carGroup;
    private final Round round;

    public Racing(CarGroup carGroup, int round) {
        this.carGroup = carGroup;
        this.round = new Round(round);
    }

    public static Racing create(CarGroup carGroup, int round) {
        return new Racing(carGroup, round);
    }

    public int getJoinedCarSize() {
        return this.carGroup.size();
    }

    public int getRemainRound() {
        return this.round.value();
    }
}
