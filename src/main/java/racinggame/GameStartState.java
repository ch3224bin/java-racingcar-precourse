package racinggame;

public class GameStartState extends GameState {
    @Override
    public View getView() {
        return View.Q_CAR_NAME;
    }

    @Override
    public void run(String input, Game game) {
        String[] carNames = input.split(",");
        game.setCarGroup(CarGroup.create(carNames));
    }

    @Override
    GameState getNextState() {
        return new GameInputRoundState();
    }
}
