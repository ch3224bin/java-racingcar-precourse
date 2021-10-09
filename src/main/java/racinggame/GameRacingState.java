package racinggame;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class GameRacingState extends GameState {
    @Override
    View getView() {
        return View.RACING_START;
    }

    @Override
    ResultView run(Supplier<String> readLine, Game game) {
        Racing racing = game.getRacing();
        List<RoundResult> roundResults = new ArrayList<>();
        while (!racing.isFinish()) {
            roundResults.add(racing.play());
        }
        return new ResultView(View.GAME_REPORT, roundResults);
    }

    @Override
    GameState getNextState() {
        return null;
    }
}
