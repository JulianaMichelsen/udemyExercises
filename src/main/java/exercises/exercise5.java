/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

package exercises;

import java.util.Scanner;
import java.util.Locale;

public class exercise5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code1 = sc.nextInt();
        int number1 = sc.nextInt();
        double value1 = sc.nextDouble();
        int code2 = sc.nextInt();
        int number2 = sc.nextInt();
        double value2 = sc.nextDouble();

        double total = (number1 * value1) + (number2 * value2);

        System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);

        sc.close();
    }
}
