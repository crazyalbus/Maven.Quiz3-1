package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("PAPER", "SCISSOR"),
    PAPER("SCISSOR", "ROCK"),
    SCISSOR("ROCK", "PAPER");

    String winner;
    String loser;

    RockPaperScissorHandSign(String winner, String loser) {
        this.winner = winner;
        this.loser = loser;
    }

    public RockPaperScissorHandSign getWinner() {
        return valueOf(winner);
    }

    public RockPaperScissorHandSign getLoser() {
        return valueOf(loser);
    }
}