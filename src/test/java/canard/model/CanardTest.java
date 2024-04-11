package canard.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import canard.model.cancan.CanardMuet;
import canard.model.vol.NePasVoler;

public class CanardTest {

    private static final String NAGER = "Je nage";

    private static final String VOLER = "Je vole avec des ailes";
    private static final String NE_PAS_VOLER = "Je ne peux pas voler";

    private static final String CANCAN = "Cancan";
    private static final String SILENCE = "<< Silence >>";

    Canard colvert;
    Canard leurre;
    Canard mandarin;
    Canard canardPlastique;

    @BeforeEach
    private void extracted() {
        colvert = new Colvert("Piero");
        leurre = new Leurre("Danny");
        mandarin = new Mandarin("Oshidori");
        canardPlastique = new CanardEnPlastique("Rubber");
    }

	@Test
	public void test_effectuerVol() {
		String texteVolColvert = colvert.voler();
		assertEquals(VOLER, texteVolColvert);

		assertEquals(VOLER, mandarin.voler());

		assertEquals(NE_PAS_VOLER, leurre.voler());
		assertEquals(NE_PAS_VOLER, canardPlastique.voler());
	}


    @Test
    public void test_changerComportementVol() {
        assertEquals(VOLER, colvert.voler());

        colvert.setComportementVol(new NePasVoler());

        assertEquals(NE_PAS_VOLER, colvert.voler());
    }

    @Test
    public void test_changerComportementCancan() {

        assertEquals(CANCAN, colvert.faireCancan());

        colvert.setComportementCancan(new CanardMuet());

        assertEquals(SILENCE, colvert.faireCancan());
    }

    @Test
    public void test_nager() {

        assertEquals(NAGER, colvert.nager());
        assertEquals(NAGER, mandarin.nager());

        assertEquals(NAGER, leurre.nager());
        assertEquals(NAGER, canardPlastique.nager());
    }

    @Test
    void test_presentation_nom_et_afficher() {
        assertEquals("Piero", colvert.getNom());
        assertEquals("Je suis un colvert", colvert.afficher());

        assertEquals("Oshidori", mandarin.getNom());
        assertEquals("Je suis un canard mandarin", mandarin.afficher());

        assertEquals("Danny", leurre.getNom());
        assertEquals("Je suis un leurre.", leurre.afficher());

        assertEquals("Rubber", canardPlastique.getNom());
        assertEquals("Je suis un canard en plastique", canardPlastique.afficher());
    }

}