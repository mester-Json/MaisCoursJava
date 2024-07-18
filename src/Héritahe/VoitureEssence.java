package Héritahe ;


public class VoitureEssence extends Voiture {
    private int capaciteReservoir;

    public VoitureEssence(String marque, String modele, int annee, int capaciteReservoir) {
        super(marque, modele, annee);
        this.capaciteReservoir = capaciteReservoir;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Capacité du réservoir: " + capaciteReservoir + " litres");
    }

    // Getter et setter
    public int getCapaciteReservoir() {
        return capaciteReservoir;
    }

    public void setCapaciteReservoir(int capaciteReservoir) {
        this.capaciteReservoir = capaciteReservoir;
    }
}
