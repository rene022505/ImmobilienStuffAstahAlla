import java.util.ArrayList;

public class Immobilienbüro {

    private String name, adresse;
    ArrayList<Immobilie> immoListe = new ArrayList<>();

    Immobilienbüro(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public void immoHinzu(Immobilie immo) {
        immoListe.add(immo);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("--- Immobilienbüro ---\n" +
                "Straße: " + this.adresse +
                "\nName: " + this.name);
        immoListe.forEach(s::append);
        return s.toString();
    }

}
