package exercise3;

public class MainVehicules {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Peugeot 308", 22000.0, "308", 2020);
        Moto moto = new Moto("Yamaha MT-07", 7500.0, "Yamaha", 74);
        Avion avion = new Avion("Boeing 737", 90000000.0, "AirExpress", 900.0);

        // Émettre les sons spécifiques
        voiture.emettreSon();
        moto.emettreSon();
        avion.emettreSon();

        System.out.println();

        // Afficher les informations complètes
        voiture.afficherInformations();
        System.out.println();
        moto.afficherInformations();
        System.out.println();
        avion.afficherInformations();
    }
}
