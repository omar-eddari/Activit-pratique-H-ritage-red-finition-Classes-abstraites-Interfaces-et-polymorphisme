public class Manager extends Employe {
    private String service;

    public Manager() {
        super();
        this.service = "";
    }

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        return salaire * 1.20; // augmentation de 20%
    }

    public String getService() { return service; }

    @Override
    public String toString() {
        return super.toString() + ", Service: " + service + ", Salaire (après): " + String.format("%.2f", calculerSalaire());
    }
}
