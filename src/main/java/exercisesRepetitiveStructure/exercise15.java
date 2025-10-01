/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */

package exercisesRepetitiveStructure;

import java.util.Scanner;

public class exercise15 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int correctPassword = 2002;
        int password = scanner.nextInt();

        while (password != correctPassword) {
            System.out.println("Senha Invalida");
            password = scanner.nextInt();
        }
        System.out.println("Acesso Permitido");

        scanner.close();
    }
}
