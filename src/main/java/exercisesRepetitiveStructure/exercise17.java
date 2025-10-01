/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
 */

package exercisesRepetitiveStructure;

import java.util.Scanner;

public class exercise17 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int product = scanner.nextInt();

        int alcohol = 0;
        int gas = 0;
        int diesel = 0;

        while (product != 4){
            product = productChoiceValidate(product);

            if (product == 1){
                alcohol += 1;
                product = scanner.nextInt();
            } else if (product == 2){
                gas += 1;
                product = scanner.nextInt();
            } else if (product == 3){
                diesel += 1;
                product = scanner.nextInt();
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }

    private static int productChoiceValidate(int product) {
        Scanner scanner = new Scanner(System.in);
        while (product > 4 || product <= 0) {

            product = scanner.nextInt();
        }
        return product;
    }
}

