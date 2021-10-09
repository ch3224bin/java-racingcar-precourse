package racinggame;

import nextstep.utils.Console;

import javax.xml.transform.Result;
import java.util.function.Supplier;

public class Game {
    private GameState gameState = new GameStartState();
    private CarGroup carGroup;
    private Round round;
    private Racing racing;

    public void play() {
        while (isNotFinish()) {
            System.out.println(this.gameState.getView().getMessage());
            processGame(Console::readLine);
        }
    }

    private void processGame(Supplier<String> readLine) {
        try {
            ResultView resultView = this.gameState.process(readLine, this);
            printResultView(resultView);
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR]" + e.getMessage());
        }
    }

    private void printResultView(ResultView resultView) {
        if (resultView != null) {
            System.out.println(resultView.getMessage());
        }
    }

    private boolean isNotFinish() {
        return round == null || !round.isFinish();
    }

    public void setCarGroup(CarGroup carGroup) {
        this.carGroup = carGroup;
    }

    public CarGroup getCarGroup() {
        return this.carGroup;
    }

    public GameState getGameState() {
        return this.gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public Round getRound() {
        return this.round;
    }

    public Racing getRacing() {
        return racing;
    }

    public void setRacing(Racing racing) {
        this.racing = racing;
    }
}
