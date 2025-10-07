/*
Ler um número inteiro N e calcular todos os seus divisores.
 */

package exercisesRepetitiveStructure;

import java.io.IOException;
import java.util.Scanner;

public class exercise23 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int divider = 1;

        for (int i = 0; i < number; i++) {
            if (number % divider == 0){
                System.out.println(divider);
            }
            divider ++;
        }


        scanner.close();
    }
}


