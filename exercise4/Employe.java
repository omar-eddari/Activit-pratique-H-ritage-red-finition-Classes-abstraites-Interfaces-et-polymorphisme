public abstract class Employe {
    protected String nom;
    protected String prenom;
    protected String email;
    protected String telephone;
    protected double salaire;

    public Employe() {
        this.nom = "";
        this.prenom = "";
        this.email = "";
        this.telephone = "";
        this.salaire = 0.0;
    }

    public Employe(String nom, String prenom, String email, String telephone, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public abstract double calculerSalaire();

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getEmail() { return email; }
    public String getTelephone() { return telephone; }
    public double getSalaire() { return salaire; }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Email: " + email + ", Téléphone: " + telephone + ", Salaire: " + salaire;
    }
}
