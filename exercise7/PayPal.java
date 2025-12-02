public class PayPal extends Paiement {
    private String email;

    public PayPal(String email, String numeroTransaction) {
        super(numeroTransaction);
        this.email = email;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("[PayPal] Paiement de " + montant + "€ effectué via PayPal (" + email + "). Transaction: "
                + getNumeroTransaction());
    }
}
