public class Main {
    public static void main(String[] args) {
        Adherent adh = new Adherent("Dupont", "Jean", "jean.dupont@example.com", "0123456789", 30, 1001);

        Auteur auteur = new Auteur("Martin", "Alice", "alice.martin@example.com", "0987654321", 45, 2002);
        Livre livre = new Livre(123456, "Programmation Java", auteur);

        System.out.println("--- Adhérent ---");
        System.out.println(adh.toString());

        System.out.println("\n--- Livre ---");
        System.out.println(livre.toString());
    }
}
