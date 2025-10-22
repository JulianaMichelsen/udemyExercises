/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
 */

package exercisesVectors;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantity;

        System.out.print("Quantos numeros voce vai digitar? ");
        quantity = scanner.nextInt();

        int[] numbers = new int[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = scanner.nextInt();
            }
        System.out.println("NUMEROS PARES");
        int countPairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 ==0) {
                System.out.print(numbers[i] + " ");
                countPairs ++;
            }
        }

        System.out.println("QUANTIDADE DE PARES: " + countPairs);

        scanner.close();

    }
}
