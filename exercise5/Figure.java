public abstract class Figure {
    protected String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double calculerAire();

    public abstract double calculerPerimetre();

    public void afficherDetails() {
        double aire = calculerAire();
        double perimetre = calculerPerimetre();
        System.out.printf("Figure: %s%nAire: %.4f%nPerimetre: %.4f%n%n", nom, aire, perimetre);
    }
}
