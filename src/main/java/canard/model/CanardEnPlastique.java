package canard.model;

import canard.model.cancan.Coincoin;
import canard.model.vol.NePasVoler;

public class CanardEnPlastique extends Canard {

    public CanardEnPlastique(String nom) {
        super(nom, new NePasVoler(), new Coincoin());
    }

    @Override
    public String nager() {
        return "Je ne peux pas nager";
    }

    @Override
    public String afficher() {
        return "Je suis un canard en plastique";
    }
}