package canard.model;


import canard.model.cancan.Cancan;
import canard.model.vol.NePasVoler;

public class PrototypeCanard extends Canard {

	public PrototypeCanard(String nom) {
        super(nom, new NePasVoler(), new Cancan());
    }

    @Override
    public String nager() {
        return "Tous les canards flottent, même les leurres! mais pas les prototypes de canards!";
    }


    @Override
    public String afficher() {
        return "Je suis un prototype de canard";
    }

}
