/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
 */

package exercises;

import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int soma = number1 + number2;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}