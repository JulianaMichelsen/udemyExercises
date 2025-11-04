package exerciseList;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}


public class exercise1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many employees will be registred? ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        Employee[] employees = new Employee[quantity];

        for (int i = 0; i < quantity; i++) {
            scanner.nextLine();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            employees[i] = new Employee(id, name, salary);
        }


        Arrays.sort(employees, (n1, n2) -> n1.id - n2.id);

        scanner.nextLine();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrease = scanner.nextInt();
        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        for (Employee emp : employees) {
            if (emp.id == idIncrease) {
                emp.salary += emp.salary * percentage / 100.0;
                break;
            }
        }

        System.out.println("\nList of employees:");
        for (Employee  emp : employees) {
            System.out.println(emp.id + ", " + emp.name + ", " + emp.salary);
        }

        scanner.close();
    }



}
