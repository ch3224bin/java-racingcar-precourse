package racinggame;

import java.util.List;

public class ResultView {
    private final View view;
    private final RoundResults roundResults;

   public ResultView(View view, List<RoundResult> roundResults) {
        this.view = view;
        this.roundResults = new RoundResults(roundResults);
    }

    public String getMessage() {
        if (this.roundResults != null) {
            return this.view.getMessage(this.roundResults);
        }
        return this.view.getMessage();
    }
}
