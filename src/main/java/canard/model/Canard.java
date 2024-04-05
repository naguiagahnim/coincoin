package canard.model;

import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;


public abstract class Canard {
	
	
	private String nom;
    private ComportementVol comportementVol;
    private ComportementCancan comportementCancan;


    public Canard(String nom, ComportementVol comportementVol, ComportementCancan comportementCancan) {
        this.comportementVol = comportementVol;
        this.comportementCancan = comportementCancan;
        this.nom = nom;
    }

    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }

    public void setComportementCancan(ComportementCancan comportementCancan) {
        this.comportementCancan = comportementCancan;
    }

    public String afficher() {
        return "Je suis un canard";
    }

    public String nager() {
        return "Je nage";
    }

    public String faireCancan() {
        return comportementCancan.cancaner();
    }

    public String voler() {
        return comportementVol.voler();
    }
    
    public String getNom() {
        return nom;
    }
}
