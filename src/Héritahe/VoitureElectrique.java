package Héritahe ;


public class VoitureElectrique extends Voiture {
    private int autonomie;

    public VoitureElectrique(String marque, String modele, int annee, int autonomie) {
        super(marque, modele, annee);
        this.autonomie = autonomie;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Autonomie: " + autonomie + " km");
    }

    // Getter et setter
    public int getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(int autonomie) {
        this.autonomie = autonomie;
    }
}
