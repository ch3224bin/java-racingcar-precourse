package racinggame;

public class Racing {
    private final CarGroup carGroup;
    private final Round round;

    public Racing(CarGroup carGroup, Round round) {
        this.carGroup = carGroup;
        this.round = round;
    }

    public int getJoinedCarSize() {
        return this.carGroup.size();
    }

    public int getRemainRound() {
        return this.round.value();
    }

    public RoundResult play() {
        this.round.decrease();
        this.carGroup.injectEnergy();
        return new RoundResult(this.carGroup.getCars());
    }

    public boolean isFinish() {
        return this.round.isFinish();
    }
}
