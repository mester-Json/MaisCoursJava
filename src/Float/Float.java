package Float;

import java.util.Scanner;

public class Float {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entrez le premier nombre: ");
		float nombre1 = scanner.nextFloat();

		System.out.print("Entrez le deuxième nombre: ");
		float nombre2 = scanner.nextFloat();

		float moyenne = (nombre1 + nombre2) / 2;

		System.out.println("La moyenne des deux nombres est: " + moyenne);

		scanner.close();
	}
}
