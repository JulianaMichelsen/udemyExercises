/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
 */

package exercisesRepetitiveStructure;

import java.util.Scanner;

public class exercise18 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 0; i <= number ; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}