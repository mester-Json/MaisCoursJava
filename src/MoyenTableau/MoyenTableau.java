package MoyenTableau;

public class MoyenTableau {
    public static void main(String[] args) {

    	int[] array = {10, 20, 30, 40, 50};

        int max = array[0];
        int sum = 0;

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        double average = (double) sum / array.length;

        System.out.println("Le maximum du tableau est: " + max);
        System.out.println("La moyenne du tableau est: " + average);
    }
}
