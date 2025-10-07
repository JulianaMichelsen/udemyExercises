/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

package exercisesRepetitiveStructure;

import java.io.IOException;
import java.util.Scanner;

public class exercise21 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++) {
                double number1 = scanner.nextInt();
                double number2 = scanner.nextInt();

                if (number2 == 0.0) {
                    System.out.println("divisao impossivel");
                } else {
                    double division = number1 / number2;
                    System.out.printf("%.1f%n", division);
                }


            }

            scanner.close();
        }
    }

