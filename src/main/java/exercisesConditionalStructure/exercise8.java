/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

 */

package exercisesConditionalStructure;

import java.util.Scanner;

public class exercise8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}