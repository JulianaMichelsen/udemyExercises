/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
 */

package exercisesVectors;

import java.util.Locale;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantity, minors;
        double averageHeight, totalHeight, percentualMinors;


        System.out.print("Quantas pessoas serão digitadas? ");
        quantity = scanner.nextInt();

        double[] vector = new double[quantity];

        String[] names = new String[quantity];
        int[] ages = new int[quantity];
        double[] heights = new double[quantity];

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            names[i] = scanner.next();
            System.out.print("Idade: ");
            ages[i] = scanner.nextInt();
            System.out.print("Altura: ");
            heights[i] = scanner.nextDouble();
        }

        minors = 0;
        totalHeight = 0;
        for (int i = 0; i < quantity; i++) {
            if (ages[i] < 16){
                minors++;
            }
            totalHeight = totalHeight + heights[i];
        }

        averageHeight = totalHeight / quantity;
        System.out.printf("Altura média: %.2f%n", averageHeight);
        percentualMinors = ((double) minors/ quantity) * 100.00;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%n", percentualMinors, "%");

        for (int i = 0; i < quantity; i++) {
            if(ages[i] < 16){
                System.out.printf("%s\n", names[i]);
            }

        }
        scanner.close();

    }
}
