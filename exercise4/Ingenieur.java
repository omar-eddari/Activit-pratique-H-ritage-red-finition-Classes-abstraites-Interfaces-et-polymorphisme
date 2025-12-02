public class Ingenieur extends Employe {
    private String specialite;

    public Ingenieur() {
        super();
        this.specialite = "";
    }

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        return salaire * 1.15; // augmentation de 15%
    }

    public String getSpecialite() { return specialite; }

    @Override
    public String toString() {
        return super.toString() + ", Spécialité: " + specialite + ", Salaire (après): " + String.format("%.2f", calculerSalaire());
    }
}
