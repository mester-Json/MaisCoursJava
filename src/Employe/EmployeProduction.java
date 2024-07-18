package Employe;

import java.time.LocalDate;

public class EmployeProduction extends Employe {
    private int unitesProduites;

    public EmployeProduction(String nom, String prenom, int age, LocalDate dateEntree, int unitesProduites) {
        super(nom, prenom, age, dateEntree);
        this.unitesProduites = unitesProduites;
    }

    @Override
    public double calculerSalaire() {
        return unitesProduites * 5;
    }

    @Override
    public String getNom() {
        return "Le producteur " + super.getNom().substring(10);
    }
}
