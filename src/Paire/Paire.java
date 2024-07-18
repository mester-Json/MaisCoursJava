package Paire;

import java.util.Scanner;

public class Paire {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez un nombre: ");
		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println("Le nombre est pair.");
		} else {
			System.out.println("Le nombre est impair.");
		}

		scanner.close();
	}
}
