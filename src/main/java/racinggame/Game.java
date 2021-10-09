package racinggame;

public class Game {
    private GameState gameState = new GameStartState();

    public GameState getState() {
        return new GameStartState();
    }

    public void play() {
        System.out.println(this.gameState.getView().getMessage());
    }
}
