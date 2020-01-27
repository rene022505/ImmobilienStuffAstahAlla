public class Mietimmobilie extends Immobilie{

    private double monatsmiete, nebenkosten, provision;

    Mietimmobilie(String straße, double wohnfläche, double monatsmiete, double nebenkosten) {
        super(straße, wohnfläche);
        this.monatsmiete = monatsmiete;
        this.nebenkosten = nebenkosten;
        this.provision = this.monatsmiete * 2;
    }

    public double getMonatsmiete() {
        return monatsmiete;
    }

    public double getNebenkosten() {
        return nebenkosten;
    }

    @Override
    public String toString() {
        return "\n--- Mietimmobilie ---\n" +
                "Straße: " + this.straße +
                "\nWohnfläche: " + this.wohnfläche + "m²" +
                "\nMiete: " + this.monatsmiete + "€\n" +
                "Provision: " + this.provision + "€" +
                "\nNebenkosten: " + this.nebenkosten + "€";
    }

}
