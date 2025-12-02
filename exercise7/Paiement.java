public abstract class Paiement {
    protected double montant;
    protected String numeroTransaction;

    public Paiement() {}

    public Paiement(String numeroTransaction) {
        this.numeroTransaction = numeroTransaction;
    }

    public String getNumeroTransaction() {
        return numeroTransaction;
    }

    public void setNumeroTransaction(String numeroTransaction) {
        this.numeroTransaction = numeroTransaction;
    }

    public abstract void effectuerPaiement(double montant);
}
