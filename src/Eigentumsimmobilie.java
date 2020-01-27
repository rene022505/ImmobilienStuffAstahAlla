public abstract class Eigentumsimmobilie extends Immobilie{

    double verkaufspreis, provisionssatz;

    Eigentumsimmobilie(String straße, double wohnfläche, double verkaufspreis, double provisionssatz) {
        super(straße, wohnfläche);
        this.verkaufspreis = verkaufspreis;
        this.provisionssatz = provisionssatz;
    }

    public double getVerkaufspreis() {
        return verkaufspreis;
    }

    public double getProvisionssatz() {
        return provisionssatz;
    }
}
