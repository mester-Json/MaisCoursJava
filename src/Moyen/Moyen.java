package Moyen;

import java.util.Scanner;

public class Moyen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entrez le premier nombre: ");
		double nombre1 = scanner.nextDouble();

		System.out.print("Entrez le deuxième nombre: ");
		double nombre2 = scanner.nextDouble();
		double moyenne = (nombre1 + nombre2) / 2;

		System.out.println("La moyenne des deux nombres est: " + moyenne);

		scanner.close();
	}
}
