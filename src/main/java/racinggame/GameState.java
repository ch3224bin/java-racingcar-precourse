package racinggame;

public abstract class GameState {
    public void process(String input, Game game) {
        run(input, game);
        game.setGameState(getNextState());
    }
    abstract View getView();
    abstract void run(String input, Game game);
    abstract GameState getNextState();
}
