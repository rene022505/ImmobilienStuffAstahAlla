public class Eigentumshaus extends Eigentumsimmobilie{

    private double grundstücksgröße, marklerGebühr;

    Eigentumshaus(String straße, double wohnfläche, double verkaufspreis, double provisionssatz, double grundstücksgröße) {
        super(straße, wohnfläche, verkaufspreis, provisionssatz);
        this.grundstücksgröße = grundstücksgröße;
        this.marklerGebühr = this.getVerkaufspreis() * this.getProvisionssatz();
    }

    public double getGrundstücksgröße() {
        return grundstücksgröße;
    }

    @Override
    public String toString() {
        return "\n--- Eigentumshaus ---\n" +
                "Straße: " + this.straße +
                "\nWohnfläche: " + this.wohnfläche + "m²" +
                "\nPreis: " + this.verkaufspreis + "€\n" +
                "Provisionssatz: " + this.provisionssatz + "%" +
                "\nGrundstücksgröße: " + this.grundstücksgröße + "m²";
    }
}
