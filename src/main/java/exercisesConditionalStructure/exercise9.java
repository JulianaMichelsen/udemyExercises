/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */

package exercisesConditionalStructure;

import java.util.Scanner;

public class exercise9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valueA = sc.nextInt();
        int valueB = sc.nextInt();

        if ((valueB / valueA) % 2 == 0){
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}