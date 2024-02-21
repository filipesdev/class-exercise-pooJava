import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        double[] vect = new double[number];

        for (int i = 0; i < number; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < number; i++) {
            sum += vect[i];
        }

        double avarage = sum / number;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avarage);

        sc.close();
    }
}