package Employe;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Personnel personnel = new Personnel();

        personnel.ajouterEmploye(new EmployeVente("Doe", "John", 30, LocalDate.of(2020, 1, 1), 10000));
        personnel.ajouterEmploye(new EmployeRepresentation("Smith", "Anna", 28, LocalDate.of(2019, 5, 15), 8000));
        personnel.ajouterEmploye(new EmployeProduction("Brown", "Bob", 45, LocalDate.of(2010, 3, 20), 500));
        personnel.ajouterEmploye(new EmployeManutention("Johnson", "Mike", 50, LocalDate.of(2015, 7, 25), 160));
        personnel.ajouterEmploye(new EmployeProductionRisque("Davis", "Alice", 40, LocalDate.of(2011, 11, 10), 400));
        personnel.ajouterEmploye(new EmployeManutentionRisque("Wilson", "Emma", 35, LocalDate.of(2018, 2, 5), 150));

        personnel.calculerSalaires();
        System.out.println("Le salaire moyen des employés est de " + personnel.salaireMoyen() + " Euros.");
    }
}
