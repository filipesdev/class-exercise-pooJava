package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int registredEmployee = scanner.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i<registredEmployee; i++) {

            System.out.println("Employee #" + (i+1));

            System.out.print("ID: ");
            int id = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            System.out.println();

            list.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee ID that will have salary increase: ");
        int userEnterId = scanner.nextInt();

        for (Employee idEmployee : list) {
            if (idEmployee.getId() == userEnterId) {
                System.out.print("Enter the percentage: ");
                double increaseSalary = scanner.nextDouble();
                idEmployee.increaseSalary(increaseSalary);
                break;
            }
        }

        System.out.println();

        System.out.println("List of employees:\n");
        for (Employee employee : list) {
            System.out.println(employee);
        }

        scanner.close();

    }
}