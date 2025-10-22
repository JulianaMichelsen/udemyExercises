/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 */

package exercisesVectors;

import java.util.Locale;
import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantity;
        double totalValues = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        quantity = scanner.nextInt();

        double[] numbers = new double[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numbers.length; i++) {
            totalValues = totalValues + numbers[i];
            }
        double averageValue = totalValues / numbers.length;
        System.out.printf("MEDIA DO VETOR = %.3f%n", averageValue);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < averageValue){
                System.out.println(numbers[i]);
            }
        }

        scanner.close();

    }
}

