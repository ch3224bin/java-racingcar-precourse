package racinggame;

import java.util.function.Supplier;

public abstract class GameState {
    public ResultView process(Supplier<String> readLine, Game game) {
        ResultView resultView = run(readLine, game);
        game.setGameState(getNextState());
        return resultView;
    }
    abstract View getView();
    abstract ResultView run(Supplier<String> readLine, Game game);
    abstract GameState getNextState();
}
