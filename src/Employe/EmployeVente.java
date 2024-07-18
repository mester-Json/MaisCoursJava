package Employe;

import java.time.LocalDate;

public class EmployeVente extends Employe {
    private double chiffreAffaire;

    public EmployeVente(String nom, String prenom, int age, LocalDate dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree);
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double calculerSalaire() {
        return 0.20 * chiffreAffaire + 400;
    }

    @Override
    public String getNom() {
        return "Le vendeur " + super.getNom().substring(10);
    }
}
