/*

Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
 */

package exercisesVectors;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantity;

        System.out.print("Quantos valores vai ter cada vetor? ");
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
