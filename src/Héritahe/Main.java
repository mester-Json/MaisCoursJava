package Héritahe ;

public class Main {
    public static void main(String[] args) {
        VoitureElectrique tesla = new VoitureElectrique("Tesla", "Model S", 2023, 600);
        VoitureEssence peugeot = new VoitureEssence("Peugeot", "308", 2020, 50);

        System.out.println("Détails de la voiture électrique:");
        tesla.afficherDetails();

        System.out.println("\nDétails de la voiture à essence:");
        peugeot.afficherDetails();
    }
}
 