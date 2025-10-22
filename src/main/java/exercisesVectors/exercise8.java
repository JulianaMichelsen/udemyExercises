/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */

package exercisesVectors;

import java.util.Locale;
import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantity;
        double totalPairs = 0;
        int pairs = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        quantity = scanner.nextInt();

        double[] numbers = new double[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                totalPairs = totalPairs + numbers[i];
                pairs ++;
            }
        }

        if (totalPairs == 0){
            System.out.println("NENHUM NUMERO PAR");
        }
        else{
            double averagePairs = totalPairs / pairs;
            System.out.printf("MEDIA DOS PARES = %.1f%n", averagePairs);
        }
        scanner.close();
    }
}

