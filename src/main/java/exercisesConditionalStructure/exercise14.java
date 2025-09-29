/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
 */

package exercisesConditionalStructure;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class exercise14 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();
        double free = 2000.00;
        double tax8;
        double tax18;
        double tax28;
        double rest ;
        double taxTotal;

        if (salary <= 2000.00){
            System.out.println("Isento");
        }
        else if (salary > 2000 && salary <= 3000.00) {
            rest = salary - free;
            tax8 = rest * 0.08;
            System.out.printf("R$ %.2f%n", tax8);
        } else if (salary > 3000 && salary <= 4500.00) {
            tax8 = 1000 * 0.08;
            rest = salary - 3000.00;
            tax18 = rest * 0.18;
            taxTotal = tax8 + tax18;
            System.out.printf("R$ %.2f%n", taxTotal);
        } else{
            tax8 = 1000 * 0.08;
            tax18 = 1500 * 0.18;
            rest = salary - 4500.00;
            tax28 = rest * 0.28;
            taxTotal = tax8 + tax18 + tax28;
            System.out.printf("R$ %.2f%n", taxTotal);
        }
        scanner.close();
    }
}
