package Employe;


import java.time.LocalDate;

public abstract class Employe {
    private String nom;
    private String prenom;
    private int age;
    private LocalDate dateEntree;

    public Employe(String nom, String prenom, int age, LocalDate dateEntree) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEntree = dateEntree;
    }

    public abstract double calculerSalaire();

    public String getNom() {
        return "L'employé " + prenom + " " + nom;
    }
}
