/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada.
Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma
dos elementos correspondentes de A e B. Imprima o vetor C gerado.
*/

package exercisesVectors;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int quantity = scanner.nextInt();

        int[] vectorA = new int[quantity];
        int[] vectorB = new int[quantity];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < quantity; i++) {
            vectorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < quantity; i++) {
            vectorB[i] = scanner.nextInt();
        }

        int[] vectorC = somaValores(vectorA, vectorB);

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < quantity; i++) {
            System.out.println(vectorC[i]);
        }

        scanner.close();
    }

    // Função que soma os valores correspondentes de dois vetores
    public static int[] somaValores(int[] vetorA, int[] vetorB) {
        int[] vetorC = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        return vetorC;
    }
}
