/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

package exercisesSequencialStructure;

import java.util.Scanner;

public class exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valueA = sc.nextInt();
        int valueB = sc.nextInt();
        int valueC = sc.nextInt();
        int valueD = sc.nextInt();

        int diference = (valueA * valueB) - (valueC * valueD);

        System.out.println("DIFERENÇA = " + diference);

        sc.close();
    }
}
