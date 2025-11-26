package exercise3;

public class Avion extends Vehicule {
    private String compagnie;
    private double vitesseMax; // en km/h

    public Avion() {
    }

    public Avion(String nom, double prix, String compagnie, double vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void emettreSon() {
        System.out.println("L'avion fait un bruit de moteur puissant.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Compagnie: " + compagnie);
        System.out.println("Vitesse max: " + vitesseMax + " km/h");
    }
}
