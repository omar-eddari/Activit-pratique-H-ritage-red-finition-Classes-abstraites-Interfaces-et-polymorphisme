public class Commande {
    private double montant;
    private Paiement moyenPaiement;

    public Commande(double montant, Paiement moyenPaiement) {
        this.montant = montant;
        this.moyenPaiement = moyenPaiement;
    }

    public double getMontant() {
        return montant;
    }

    public Paiement getMoyenPaiement() {
        return moyenPaiement;
    }

    public void processPayment() {
        System.out.println("--- Traitement commande: " + montant + "€ ---");
        moyenPaiement.effectuerPaiement(montant);
        System.out.println("--- Fin traitement ---\n");
    }
}
