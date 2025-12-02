public class Main {
    public static void main(String[] args) {
        Ingenieur ing = new Ingenieur("Dupont", "Jean", "jean.dupont@example.com", "0123456789", 3000.0, "Java");
        Manager mgr = new Manager("Martin", "Claire", "claire.martin@example.com", "0987654321", 4000.0, "Développement");

        System.out.println("Ingénieur:");
        System.out.println("Nom: " + ing.getNom());
        System.out.println("Prénom: " + ing.getPrenom());
        System.out.println("Spécialité: " + ing.getSpecialite());
        System.out.printf("Salaire (après augmentation): %.2f%n", ing.calculerSalaire());
        System.out.println();

        System.out.println("Manager:");
        System.out.println("Nom: " + mgr.getNom());
        System.out.println("Prénom: " + mgr.getPrenom());
        System.out.println("Service: " + mgr.getService());
        System.out.printf("Salaire (après augmentation): %.2f%n", mgr.calculerSalaire());
    }
}
