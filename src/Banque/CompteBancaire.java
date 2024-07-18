package Banque ;

public class CompteBancaire {
    private double solde;
    private String iban;
    private String titulaire;
    private static int compteCounter = 0;

    public CompteBancaire() {
        this("", 0.0);
    }

    public CompteBancaire(String titulaire) {
        this(titulaire, 0.0);
    }

    public CompteBancaire(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
        this.iban = "fr-5965-000" + (++compteCounter);
    }

    public void afficher() {
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Solde = " + solde);
        System.out.println("Iban = " + iban);
        System.out.println("Titulaire = " + titulaire);
        System.out.println("---------------------------------------------------------------------------------------------------");
    }

    public void crediter(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    public void debiter(double montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant;
        }
    }

    public boolean estPositif() {
        return solde > 0;
    }

    public double getSolde() {
        return solde;
    }

    public String getIban() {
        return iban;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }
}
