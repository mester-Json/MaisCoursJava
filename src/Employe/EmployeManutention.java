package Employe;


import java.time.LocalDate;

public class EmployeManutention extends Employe {
    private int heuresTravaillees;

    public EmployeManutention(String nom, String prenom, int age, LocalDate dateEntree, int heuresTravaillees) {
        super(nom, prenom, age, dateEntree);
        this.heuresTravaillees = heuresTravaillees;
    }

    @Override
    public double calculerSalaire() {
        return heuresTravaillees * 65;
    }

    @Override
    public String getNom() {
        return "Le manutentionnaire " + super.getNom().substring(10);
    }
}
