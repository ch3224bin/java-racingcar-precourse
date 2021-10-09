package racinggame;

public class GameInputRoundState extends GameState {
    @Override
    public View getView() {
        return View.Q_ROUND;
    }

    @Override
    public void run(String input, Game game) {
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException();
        }

        game.setRound(new Round(Integer.parseInt(input)));
    }

    @Override
    GameState getNextState() {
        return null;
    }
}
