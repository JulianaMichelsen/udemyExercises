/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 */

package exercisesConditionalStructure;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise11 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Double> table = new HashMap<>();

        table.put(1, 4.00);
        table.put(2, 4.50);
        table.put(3, 5.00);
        table.put(4, 2.00);
        table.put(5, 1.50);

        int order = scanner.nextInt();
        int quantity = scanner.nextInt();
        double total = 0;

        if (table.containsKey(order)){
            double price = table.get(order);
            total = quantity * price;
            System.out.printf("Total: R$ %.2f%n", total);
        }

        scanner.close();
    }
}
