package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int numberToExucute = sc.nextInt();
        Product vect[] = new Product[numberToExucute];

        for (int i = 0; i< vect.length; i++) {
            sc.nextLine();
            String productName = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(productName, price);
        }

        double sum = 0;
        for (int i = 0; i< vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avarage = sum / vect.length;

        System.out.printf("Avarage price = %.2f%n", avarage);

        sc.close();

    }
}