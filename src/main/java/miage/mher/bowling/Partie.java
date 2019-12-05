package miage.mher.bowling;

import java.util.ArrayList;

public class Partie {

    private Jeu[] listeJeux;

    public Partie(Jeu[] liste) {
        listeJeux = liste;
    }

    public Jeu[] getListeJeux() {
        return listeJeux;
    }


    public int getScorePartie() {
        int total = 0;
        for (Jeu jeu : listeJeux ) {
            total += jeu.getScoreJeu();
        }
        return total;
    }
}
