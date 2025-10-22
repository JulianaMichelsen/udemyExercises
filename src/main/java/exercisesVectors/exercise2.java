/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor .
 */

package exercisesVectors;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantity;
        double sum, average;

        System.out.print("Quantos números você vai digitar? ");
        quantity = scanner.nextInt();

        double[] vector = new double[quantity];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = scanner.nextDouble();
        }

        scanner.close();

        System.out.print("VALORES");

        for (int i = 0; i < vector.length; i++) {
            System.out.println(" " + vector[i]);
        }

        sum = 0;
        sum = Arrays.stream(vector).sum();
        System.out.println("SOMA = " + sum);

        average = sum / vector.length;
        System.out.println("MEDIA = " + average);



    }
}
