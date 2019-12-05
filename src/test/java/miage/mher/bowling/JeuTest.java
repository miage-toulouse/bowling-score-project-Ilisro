package miage.mher.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JeuTest {

    @Test
    public void testJeuValide() {
        // given : un jeu valide
        //Jeu jeu1 = new Jeu(1,5);
        // when : je teste la validité
        //boolean res = jeu1.isValid();
        // then : le resultat est positif
        //assertTrue(res);

        assertTrue(new Jeu(10).isValid());
        assertTrue(new Jeu(6, 4).isValid());
        assertTrue(new Jeu(2,5).isValid());
    }

    @Test
    public void testJeuNonValide() {
        assertFalse(new Jeu(11).isValid());
        assertFalse(new Jeu(6, 5).isValid());
        assertFalse(new Jeu(2,15).isValid());
    }

    @Test
    public void calculScoreJeu() {
        assertEquals(9, new Jeu(5,4).getScoreJeu());
        assertEquals(10, new Jeu(6,4).getScoreJeu());
        assertEquals(10, new Jeu(10).getScoreJeu());
    }
}