package canard.model.vol;

public class NePasVoler implements ComportementVol {

    public NePasVoler() {
    }

    @Override
    public String voler() {
        return "Je ne peux pas voler";
    }
}
