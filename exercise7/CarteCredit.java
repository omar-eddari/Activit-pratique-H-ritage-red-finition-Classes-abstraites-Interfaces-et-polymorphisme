public class CarteCredit extends Paiement {
    private String numeroCarte;

    public CarteCredit(String numeroCarte, String numeroTransaction) {
        super(numeroTransaction);
        this.numeroCarte = numeroCarte;
    }

    private String maskNumeroCarte() {
        if (numeroCarte == null) return "(numéro inconnu)";
        int len = numeroCarte.length();
        if (len <= 4) return numeroCarte;
        return "**** **** **** " + numeroCarte.substring(len - 4);
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("[CarteCredit] Paiement de " + montant + "€ effectué avec la carte " + maskNumeroCarte()
                + ". Transaction: " + getNumeroTransaction());
    }
}
