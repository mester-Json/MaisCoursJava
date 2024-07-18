package Employe;


import java.time.LocalDate;

public class EmployeRepresentation extends Employe {
    private double chiffreAffaire;

    public EmployeRepresentation(String nom, String prenom, int age, LocalDate dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree);
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double calculerSalaire() {
        return 0.20 * chiffreAffaire + 800;
    }

    @Override
    public String getNom() {
        return "Le représentant " + super.getNom().substring(10);
    }
}
