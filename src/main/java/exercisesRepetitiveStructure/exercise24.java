/*
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
 */

package exercisesRepetitiveStructure;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.pow;


public class exercise24 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int line = 1;

        for (int i = 0; i < number; i++) {
            int square = (int) pow(line, 2);
            int cube = (int) pow(line, 3);
            System.out.print(line + " ");
            System.out.print(square + " ");
            System.out.println(cube);
            line ++;
        }


        scanner.close();
    }
}


