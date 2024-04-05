package canard;

public class Simulateur {

    public static void main(String[] args) {
        Canard colvert = new Colvert();
        colvert.afficher();
        colvert.faireCancan();
        colvert.voler();

        Canard mandarin = new Mandarin();
        mandarin.afficher();
        mandarin.faireCancan();
        mandarin.voler();

        Canard leurre = new Leurre();
        leurre.afficher();
        leurre.faireCancan();
        leurre.voler();

        Canard canardEnPlastique = new CanardEnPlastique();
        canardEnPlastique.afficher();
        canardEnPlastique.faireCancan();
        canardEnPlastique.voler();
    }
}
