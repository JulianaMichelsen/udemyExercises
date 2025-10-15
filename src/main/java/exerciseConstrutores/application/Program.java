package exerciseConstrutores.application;

import exerciseConstrutores.entities.Acount;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // limpa buffer

        System.out.print("Enter account holder: ");
        String holder = scanner.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = scanner.next().charAt(0);

        double initialDeposit = 0.0;
        if (response == 'y' || response == 'Y') {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = scanner.nextDouble();
        }

        Acount acount = new Acount(number, holder, initialDeposit);

        System.out.println();
        System.out.println("Account data:");
        System.out.println(acount);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();
        acount.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(acount);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scanner.nextDouble();
        acount.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(acount);

        scanner.close();
    }
}
