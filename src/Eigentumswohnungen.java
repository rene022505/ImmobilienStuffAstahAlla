public class Eigentumswohnungen extends Eigentumsimmobilie {

    private int anzahlStockwerke;
    private double marklerGebühr;

    Eigentumswohnungen(String straße, double wohnfläche, double verkaufspreis, double provisionssatz, int stockwerke) {
        super(straße, wohnfläche, verkaufspreis, provisionssatz);
        this.anzahlStockwerke = stockwerke;
        this.marklerGebühr = this.verkaufspreis * this.verkaufspreis;
    }

    public int getAnzahlStockwerke() {
        return anzahlStockwerke;
    }

    @Override
    public String toString() {
        return "\n--- Eigentumswohnung ---\n" +
                "Straße: " + this.straße +
                "\nWohnfläche: " + this.wohnfläche + "m²" +
                "\nPreis: " + this.verkaufspreis + "€\n" +
                "Provisionssatz: " + this.provisionssatz + "%" +
                "\nStockwerke: " + this.anzahlStockwerke;
    }

}
