/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
 Fórmula da área: area = π . raio2
 Considere o valor de π = 3.14159
 */

package exercises;

import java.util.Scanner;
import java.util.Locale;
import static java.lang.Math.pow;

public class exercise2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        double radius = sc.nextDouble();
        double pi = 3.14159;
        double circleArea = pi * pow(radius, 2);

        System.out.printf("A=%.4f%n", circleArea);

        sc.close();
    }
}
