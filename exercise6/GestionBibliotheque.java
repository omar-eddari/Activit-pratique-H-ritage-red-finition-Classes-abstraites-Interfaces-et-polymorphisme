public class GestionBibliotheque {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry");
        Livre livre2 = new Livre("1984", "George Orwell");
        DVD dvd1 = new DVD("Inception", "Christopher Nolan");

        Utilisateur alice = new Utilisateur("Alice");
        Utilisateur bob = new Utilisateur("Bob");

        // Alice emprunte un livre et un DVD
        alice.emprunterObjet(livre1);
        alice.emprunterObjet(dvd1);

        // Bob essaie d'emprunter le même livre
        bob.emprunterObjet(livre1);

        // Alice retourne le livre
        alice.retournerObjet(livre1);

        // Bob réessaie et emprunte le livre
        bob.emprunterObjet(livre1);

        // Afficher quelques actions supplémentaires
        bob.emprunterObjet(livre2);
        bob.retournerObjet(dvd1); // DVD était emprunté par Alice
        alice.retournerObjet(dvd1); // Alice retourne le DVD
    }
}
