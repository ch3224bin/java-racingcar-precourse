package racinggame;

import nextstep.utils.Console;

public class Game {
    private GameState gameState = new GameStartState();
    private CarGroup carGroup;
    private Round round;

    public void play() {
        while (isNotFinish()) {
            System.out.println(this.gameState.getView().getMessage());
            String input = Console.readLine();
            processGame(input);
        }
    }

    private void processGame(String input) {
        try {
            this.gameState.process(input, this);
        } catch (Exception e) {
            System.out.println("[ERROR]");
        }
    }

    private boolean isNotFinish() {
        return round == null || !round.isFinish();
    }

    public void setCarGroup(CarGroup carGroup) {
        this.carGroup = carGroup;
    }

    public CarGroup getCarGroup() {
        return this.carGroup;
    }

    public GameState getGameState() {
        return this.gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public Round getRound() {
        return this.round;
    }
}
