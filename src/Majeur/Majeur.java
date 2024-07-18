package Majeur;

import java.util.Scanner;

public class Majeur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom: ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre sexe (M/F): ");
        String sexe = scanner.nextLine();

        System.out.print("Entrez votre âge: ");
        int age = scanner.nextInt();

        String majorite = (age >= 18) ? "majeur(e)" : "mineur(e)";
        String genre;
        if (sexe.equalsIgnoreCase("M")) {
            genre = "un homme";
        } else if (sexe.equalsIgnoreCase("F")) {
            genre = "une femme";
        } else {
            genre = "d'un sexe non spécifié";
        }

        System.out.println(nom + " est " + genre + " et " + majorite + ".");

        scanner.close();
    }
}

