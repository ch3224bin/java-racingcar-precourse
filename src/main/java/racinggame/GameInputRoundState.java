package racinggame;

import java.util.function.Supplier;

public class GameInputRoundState extends GameState {
    @Override
    public View getView() {
        return View.Q_ROUND;
    }

    @Override
    public ResultView run(Supplier<String> readLine, Game game) {
        String input = readLine.get();
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException();
        }
        game.setRound(new Round(Integer.parseInt(input)));
        game.setRacing(new Racing(game.getCarGroup(), game.getRound()));
        return null;
    }

    @Override
    GameState getNextState() {
        return new GameRacingState();
    }
}
