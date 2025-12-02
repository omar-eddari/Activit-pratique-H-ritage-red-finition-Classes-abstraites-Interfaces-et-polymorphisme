public class GestionPaiementApp {
    public static void main(String[] args) {
        Paiement carte = new CarteCredit("1234567812345678", "TXN001");
        Commande commande1 = new Commande(150.0, carte);

        Paiement paypal = new PayPal("client@example.com", "TXN002");
        Commande commande2 = new Commande(49.99, paypal);

        commande1.processPayment();
        commande2.processPayment();
    }
}
