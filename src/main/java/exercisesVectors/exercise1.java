/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

 */

package exercisesVectors;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantity;

        System.out.print("Quantos números você vai digitar? ");
        quantity = scanner.nextInt();

        int[] vector = new int[quantity];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println("NUMEROS NEGATIVOS");

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0){
                System.out.println(vector[i]);
            }
        }



    }
}
