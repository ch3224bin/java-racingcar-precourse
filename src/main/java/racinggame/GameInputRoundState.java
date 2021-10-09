package racinggame;

public class GameInputRoundState extends GameState {
    @Override
    public View getView() {
        return View.Q_ROUND;
    }

    @Override
    public void run(String input, Game game) {

    }

    @Override
    GameState getNextState() {
        return null;
    }
}
