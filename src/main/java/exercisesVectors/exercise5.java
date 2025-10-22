/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
 */

package exercisesVectors;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantity;

        System.out.print("Quantos numeros voce vai digitar? ");
        quantity = scanner.nextInt();

        double[] numbers = new double[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = scanner.nextDouble();
        }
        double biggerNumber = Arrays.stream(numbers).max().getAsDouble();

        int positionBiggest = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == biggerNumber){
                positionBiggest = i;
            }

        }

        System.out.printf("MAIOR VALOR = %.1f%n", biggerNumber);
        System.out.println("POSICAO DO MAIOR VALOR = " +  positionBiggest);

        scanner.close();

    }
}
