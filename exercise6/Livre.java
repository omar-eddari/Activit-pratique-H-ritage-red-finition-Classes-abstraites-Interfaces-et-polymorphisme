public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private boolean emprunte;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.emprunte = false;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public boolean isEmprunte() {
        return emprunte;
    }

    @Override
    public void emprunter() {
        if (emprunte) {
            System.out.println("Le livre '" + titre + "' de " + auteur + " est déjà emprunté.");
        } else {
            emprunte = true;
            System.out.println("Le livre '" + titre + "' de " + auteur + " a été emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (!emprunte) {
            System.out.println("Le livre '" + titre + "' de " + auteur + " n'est pas emprunté.");
        } else {
            emprunte = false;
            System.out.println("Le livre '" + titre + "' de " + auteur + " a été retourné.");
        }
    }

    @Override
    public String toString() {
        return "Livre{titre='" + titre + "', auteur='" + auteur + "', emprunte=" + emprunte + "}";
    }
}
