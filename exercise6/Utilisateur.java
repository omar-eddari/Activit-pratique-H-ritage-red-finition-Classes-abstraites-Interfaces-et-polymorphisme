public class Utilisateur {
    private String nom;

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void emprunterObjet(Empruntable objet) {
        System.out.println(nom + " essaie d'emprunter l'objet: " + objet);
        objet.emprunter();
    }

    public void retournerObjet(Empruntable objet) {
        System.out.println(nom + " retourne l'objet: " + objet);
        objet.retourner();
    }
}
