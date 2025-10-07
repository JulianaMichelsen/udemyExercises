/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */

package exercisesRepetitiveStructure;

import java.util.Scanner;

public class exercise19 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int numberQuantity = scanner.nextInt();
        int value;
        int valueIn = 0;
        int valueOut = 0 ;

        for (int i = 0; i < numberQuantity ; i++) {
            value = scanner.nextInt();
            if (value >= 10 && value >= 20){
                valueIn ++;
            }
            else {
                valueOut ++;
            }
        }
        System.out.println(valueIn + " in");
        System.out.println(valueOut + " out");
        scanner.close();
    }
}