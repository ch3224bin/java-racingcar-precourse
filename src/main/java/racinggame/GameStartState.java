package racinggame;

public class GameStartState implements GameState {
    @Override
    public View getView() {
        return View.Q_CAR_NAME;
    }

    @Override
    public void process(String input, Game game) {
        String[] carNames = input.split(",");
        game.setCarGroup(CarGroup.create(carNames));
    }
}
