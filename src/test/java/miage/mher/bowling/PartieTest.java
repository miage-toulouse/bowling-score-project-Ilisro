package miage.mher.bowling;

import com.sun.xml.internal.ws.policy.sourcemodel.AssertionData;
import miage.mher.bowling.Jeu;
import miage.mher.bowling.Partie;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PartieTest {

    private Partie partieStrike, partieSpare;
    private Jeu jeu1, jeu2, jeu3;

    @Before
    public void setUp() throws Exception {
        jeu1 = new Jeu(2, 4);
        jeu2 = new Jeu(5, 5);
        jeu3 = new Jeu(10, 0);
        Jeu[] jeux1 = {jeu3, jeu3, jeu3, jeu3, jeu3, jeu3, jeu3, jeu3, jeu3, jeu3};
        partieStrike = new Partie(jeux1);
        Jeu[] jeux2 = {jeu2, jeu2, jeu2, jeu2, jeu2, jeu2, jeu2, jeu2, jeu2, jeu2};
        partieSpare = new Partie(jeux2);
        //Jeu[] partieClassique = new Jeu[10]{};
    }

    @Test
    public void testScorePartie() {
        assertEquals(300, partieStrike.getScorePartie());
        assertEquals(150, partieSpare.getScorePartie());
    }
}