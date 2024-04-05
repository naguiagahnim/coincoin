package canard.model.cancan;

public class CanardMuet implements ComportementCancan {

    public CanardMuet() {
    }

    @Override
    public String cancaner() {
        return "<< Silence >>";
    }
}