package Banque ;


public class Main {
    public static void main(String[] args) {
        CompteBancaire compte1 = new CompteBancaire("John Doe", 1000.0);
        compte1.afficher();
        compte1.crediter(500.0);
        compte1.debiter(200.0);
        compte1.afficher();
        System.out.println("Le solde est positif: " + compte1.estPositif());

        CompteEpargne compteEpargne1 = new CompteEpargne(0.05, "Jane Smith", 2000.0);
        compteEpargne1.afficher();
        compteEpargne1.calculInterets();
        compteEpargne1.afficher();
    }
}
