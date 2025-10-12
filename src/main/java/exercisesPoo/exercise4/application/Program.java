package exercisesPoo.exercise4.application;

import exercisesPoo.exercise4.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.print("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();

        System.out.print("How manr dollars will be bought? ");
        double dollarQtd = scanner.nextDouble();

        CurrencyConverter converter = new CurrencyConverter(dollarPrice, dollarQtd);


        System.out.printf("Amount to be paid in reais = %.2f%n", converter.calculateAmountInReais());

        scanner.close();
    }
}
