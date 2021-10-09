package racinggame;

public interface GameState {
    View getView();
    void process(String input, Game game);
}
