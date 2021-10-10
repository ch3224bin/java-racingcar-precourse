package racinggame;

import java.util.function.Supplier;

public class GameFinishState extends GameState {
    @Override
    View getView() {
        return View.RACING_FINISH;
    }

    @Override
    ResultView run(Supplier<String> readLine, Game game) {
        return null;
    }

    @Override
    GameState getNextState() {
        return null;
    }
}
