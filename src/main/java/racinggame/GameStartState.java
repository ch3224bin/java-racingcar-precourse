package racinggame;

import java.util.function.Supplier;

public class GameStartState extends GameState {
    @Override
    public View getView() {
        return View.Q_CAR_NAME;
    }

    @Override
    public ResultView run(Supplier<String> readLine, Game game) {
        String[] carNames = readLine.get().split(",");
        game.setCarGroup(CarGroup.create(carNames));
        return null;
    }

    @Override
    GameState getNextState() {
        return new GameInputRoundState();
    }
}
