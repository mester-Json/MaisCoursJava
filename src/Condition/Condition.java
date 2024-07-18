package Condition;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez un nombre: ");
		int number = scanner.nextInt();

		if (number > 0) {
			System.out.println("Le nombre est positif.");
		} else if (number < 0) {
			System.out.println("Le nombre est négatif.");
		} else {
			System.out.println("Le nombre est zéro.");
		}

		scanner.close();
	}
}
