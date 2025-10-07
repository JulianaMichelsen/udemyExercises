/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */

package exercisesRepetitiveStructure;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class exercise20 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        for (int i = 0; i <= quantity; i++) {
            for (int j = 0; j < 3; j++) {
                double testCase1 = scanner.nextDouble();
                double testCase2 = scanner.nextDouble();
                double testCase3 = scanner.nextDouble();

                double result = calcWeightedMean(testCase1, testCase2, testCase3);
                System.out.printf("%.1f%n", result);
            }


        }

        scanner.close();
    }
    public static double calcWeightedMean (double testCase1, double testCase2, double testCase3) {
        int weight1 = 2;
        int weight2 = 3;
        int weight3 = 5;

        double weightedSum = (testCase1 * weight1) + (testCase2 * weight2) + (testCase3 * weight3);
        double weightSum = weight1 + weight2 + weight3;
        double weightedMean = weightedSum/weightSum;

        return weightedMean;
    }
}
