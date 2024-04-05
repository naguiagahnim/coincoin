package canard.model;

import canard.model.cancan.CanardMuet;
import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;
import canard.model.vol.NePasVoler;

public class Leurre extends Canard {

    public Leurre() {
        this(new NePasVoler(), new CanardMuet());
    }

    public Leurre(ComportementVol comportementVol, ComportementCancan comportementCancan) {
        super(comportementVol, comportementCancan);
    }

    @Override
    public String afficher() {
        return "Je suis un leurre de canard";
    }
}