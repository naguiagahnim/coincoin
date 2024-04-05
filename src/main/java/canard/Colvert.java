package canard;

import canard.model.cancan.Coincoin;
import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;
import canard.model.vol.VolerAvecDesAiles;

public class Colvert extends Canard {

    public Colvert() {
        this(new VolerAvecDesAiles(), new Coincoin());
    }

    public Colvert(ComportementVol comportementVol, ComportementCancan comportementCancan) {
        super(comportementVol, comportementCancan);
    }

    @Override
    public String afficher() {
        return "Je suis un colvert";
    }
}
