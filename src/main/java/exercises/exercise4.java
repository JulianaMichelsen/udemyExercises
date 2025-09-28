/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */

package exercises;

import java.util.Scanner;
import java.util.Locale;

public class exercise4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int hours = sc.nextInt();
        double salaryPerHour = sc.nextDouble();

        double salary = salaryPerHour * hours;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}
