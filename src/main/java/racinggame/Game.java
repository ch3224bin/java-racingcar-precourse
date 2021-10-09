package racinggame;

import nextstep.utils.Console;

public class Game {
    private GameState gameState = new GameStartState();
    private CarGroup carGroup;

    public GameState getState() {
        return new GameStartState();
    }

    public void play() {
        System.out.println(this.gameState.getView().getMessage());
        String input = Console.readLine();
        processGame(input);
    }

    private void processGame(String input) {
        try {
            this.gameState.process(input, this);
        } catch (Exception e) {
            System.out.println("[ERROR]");
        }
    }

    public void setCarGroup(CarGroup carGroup) {
        this.carGroup = carGroup;
    }

    public CarGroup getCarGroup() {
        return this.carGroup;
    }
}
