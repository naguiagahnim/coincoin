package canard;

import canard.model.cancan.CanardMuet;
import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;
import canard.model.vol.NePasVoler;

public class CanardEnPlastique extends Canard {

    public CanardEnPlastique() {
        this(new NePasVoler(), new CanardMuet());
    }

    public CanardEnPlastique(ComportementVol comportementVol, ComportementCancan comportementCancan) {
        super(comportementVol, comportementCancan);
    }

    @Override
    public void nager() {
        System.out.println("Je ne peux pas nager");
    }

    @Override
    public String afficher() {
        return "Je suis un canard en plastique";
    }
}
