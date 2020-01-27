public class MainClass {

    public static void main(String[] args) {
        Immobilienbüro nicoNudel = new Immobilienbüro("NicoNudel", "Apfelweg");

        Eigentumswohnungen eigOne = new Eigentumswohnungen("Birnenweg", (double) 90, (double) 5000, 0.5, 2);
        Eigentumshaus bigOne = new Eigentumshaus("RichKidStreet", (double) 1500, 1000099.99, 0.2, (double) 2000);
        Mietimmobilie siffWohnung = new Mietimmobilie("Siffstraße", (double) 10, 599.99, (double) 400);

        nicoNudel.immoHinzu(eigOne);
        nicoNudel.immoHinzu(bigOne);
        nicoNudel.immoHinzu(siffWohnung);

        System.out.println(nicoNudel);
    }

}
