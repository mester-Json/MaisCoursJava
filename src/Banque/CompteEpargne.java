package Banque ;

public class CompteEpargne extends CompteBancaire {
    private double taux;

    public CompteEpargne(double taux, String titulaire, double solde) {
        super(titulaire, solde);
        this.taux = taux;
    }

    public void calculInterets() {
        double interets = getSolde() * taux;
        crediter(interets);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Taux = " + taux);
        System.out.println("___________________________________________________________________________________________________");
    }
}
