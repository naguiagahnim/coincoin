package canard;

import canard.model.cancan.Cancan;
import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;
import canard.model.vol.VolerAvecDesAiles;

public class Mandarin extends Canard {

    public Mandarin() {
        this(new VolerAvecDesAiles(), new Cancan());
    }

    public Mandarin(ComportementVol comportementVol, ComportementCancan comportementCancan) {
        super(comportementVol, comportementCancan);
    }

    @Override
    public String afficher() {
        return "Je suis un canard mandarin";
    }
}