package racinggame;

import java.util.List;

public class ResultView {
    private final View view;
    private final List<RoundResult> roundResults;

   public ResultView(View view, List<RoundResult> roundResults) {
        this.view = view;
        this.roundResults = roundResults;
    }

    public String getMessage() {
        if (this.roundResults != null) {
            return this.view.getMessage(this.roundResults);
        }
        return this.view.getMessage();
    }
}
