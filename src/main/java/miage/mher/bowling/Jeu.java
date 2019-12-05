package miage.mher.bowling;

public class Jeu {

    private int score1 = 0;
    private int score2 = 0;

    public Jeu(int score1) {
        this.score1 = score1;
    }

    public Jeu(int score1, int score2) {
        this.score1 = score1;
        this.score2 = score2;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public int getScoreJeu() {
        return score1 + score2;
    }

    public boolean isValid() {
        if (score1+score2 <= 10) {
            return true;
        }
        return false;
    }
}
