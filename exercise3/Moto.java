package exercise3;

public class Moto extends Vehicule {
    private String marque;
    private int puissance; // en chevaux

    public Moto() {
    }

    public Moto(String nom, double prix, String marque, int puissance) {
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    @Override
    public void emettreSon() {
        System.out.println("La moto rugit.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Marque: " + marque);
        System.out.println("Puissance: " + puissance + " ch");
    }
}
