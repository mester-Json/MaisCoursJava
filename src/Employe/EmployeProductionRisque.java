package Employe;

import java.time.LocalDate;

public class EmployeProductionRisque extends EmployeProduction implements EmployeARisque {

    public EmployeProductionRisque(String nom, String prenom, int age, LocalDate dateEntree, int unitesProduites) {
        super(nom, prenom, age, dateEntree, unitesProduites);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + getPrime();
    }

    @Override
    public String getNom() {
        return "Le producteur à risque " + super.getNom().substring(10);
    }
}
