/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */

package exercisesRepetitiveStructure;

import java.io.IOException;
import java.util.Scanner;

public class exercise22 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);


        scanner.close();
    }
}


