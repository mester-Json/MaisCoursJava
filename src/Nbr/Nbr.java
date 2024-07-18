package Nbr;

import java.util.Scanner;

public class Nbr {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez le point de départ: ");
		int start = scanner.nextInt();

		System.out.println("Entrez le nombre de lignes: ");
		int lines = scanner.nextInt();

		int columns = 10;

		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.printf("%4d", start + (i * columns) + j);
			}
			System.out.println();
		}

		scanner.close();
	}
}
 