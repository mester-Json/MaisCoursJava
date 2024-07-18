package Test;

public class TestCours {
	static int factorial(int nbr) {
		int f;

		for (f = 1; nbr > 1; nbr--) {
			f *= nbr;
		}
		return f;
	}

	// Combinations Calculator (nCr)
	static int ncr(int nbr, int r) {
		return factorial(nbr) / (factorial(nbr - r) * factorial(r));
	}

	public static void main(String args[]) {
		System.out.println();
		int row, i, j;
		row = 6;

		for (i = 0; i <= row; i++) {
			for (j = 0; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print(" " + ncr(i, j));
			}
			System.out.println();
		}
	}
}