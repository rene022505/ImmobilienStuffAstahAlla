public abstract class Immobilie {

    String straße;
    double wohnfläche;

    Immobilie(String straße, double wohnfläche) {
        this.straße = straße;
        this.wohnfläche = wohnfläche;
    }

    public String getStraße() {
        return straße;
    }

    public double getWohnfläche() {
        return wohnfläche;
    }
}
