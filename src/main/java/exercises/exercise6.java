/*
 Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

package exercises;

import java.util.Scanner;
import java.util.Locale;
import static java.lang.Math.pow;

public class exercise6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valueA = sc.nextDouble();
        double valueB = sc.nextDouble();
        double valueC = sc.nextDouble();
        double pi = 3.14159;

        double triangleArea = (valueA * valueC) / 2;
        System.out.printf("TRIANGULO: %.3f%n", triangleArea);

        double circleArea = pi * pow(valueC, 2);
        System.out.printf("CIRCULO: %.3f%n", circleArea);


        double trapezeArea = ((valueA + valueB) * valueC / 2);
        System.out.printf("TRAPEZIO: %.3f%n", trapezeArea);

        double squareArea = pow(valueB, 2);
        System.out.printf("QUADRADO: %.3f%n", squareArea);

        double retangleArea = valueA * valueB;
        System.out.printf("RETANGULO: %.3f%n", retangleArea);



        sc.close();
    }
}
