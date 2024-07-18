package Encapsulation;

import java.util.Scanner;

public class Encapsulation {

    private String nom;
    private String prenom;
    private int age;

    public Encapsulation(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { 
            this.age = age;
        } else {
            System.out.println("L'âge doit être positif.");
        }
    }

    public void afficherInformations() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom: ");
        String nom = scanner.nextLine();

        System.out.print("Entrez le prénom: ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez l'âge: ");
        int age = scanner.nextInt();

        Encapsulation personne = new Encapsulation(nom, prenom, age);

        personne.afficherInformations();

        scanner.nextLine(); 

        System.out.print("Entrez un nouveau nom: ");
        nom = scanner.nextLine();
        personne.setNom(nom);

        System.out.print("Entrez un nouveau prénom: ");
        prenom = scanner.nextLine();
        personne.setPrenom(prenom);

        System.out.print("Entrez un nouvel âge: ");
        age = scanner.nextInt();
        personne.setAge(age);

        personne.afficherInformations();

        scanner.close();
    }
}
