
package Employe;

import java.time.LocalDate;

public class EmployeManutentionRisque extends EmployeManutention implements EmployeARisque {

    public EmployeManutentionRisque(String nom, String prenom, int age, LocalDate dateEntree, int heuresTravaillees) {
        super(nom, prenom, age, dateEntree, heuresTravaillees);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + getPrime();
    }

    @Override
    public String getNom() {
        return "Le manutentionnaire à risque " + super.getNom().substring(10);
    }
}
