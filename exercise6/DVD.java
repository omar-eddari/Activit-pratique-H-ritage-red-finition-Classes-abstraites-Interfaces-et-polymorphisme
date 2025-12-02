public class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean emprunte;

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.emprunte = false;
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public boolean isEmprunte() {
        return emprunte;
    }

    @Override
    public void emprunter() {
        if (emprunte) {
            System.out.println("Le DVD '" + titre + "' de " + realisateur + " est déjà emprunté.");
        } else {
            emprunte = true;
            System.out.println("Le DVD '" + titre + "' de " + realisateur + " a été emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (!emprunte) {
            System.out.println("Le DVD '" + titre + "' de " + realisateur + " n'est pas emprunté.");
        } else {
            emprunte = false;
            System.out.println("Le DVD '" + titre + "' de " + realisateur + " a été retourné.");
        }
    }

    @Override
    public String toString() {
        return "DVD{titre='" + titre + "', realisateur='" + realisateur + "', emprunte=" + emprunte + "}";
    }
}
