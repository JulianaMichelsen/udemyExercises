package exercisesVectors;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;


class Rental {
    int room;
    String name;
    String email;

    Rental(int room, String name, String email) {
        this.room = room;
        this.name = name;
        this.email = email;
    }
}


public class desafioVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        Rental[] rentals = new Rental[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            scanner.nextLine();
            rentals[i] = new Rental(room, name, email);
        }


        Arrays.sort(rentals, (r1, r2) -> r1.room - r2.room);

        System.out.println("\nBusy rooms (sorted):");
        for (Rental r : rentals) {
            System.out.println("Room " + r.room + ": " + r.name + ", " + r.email);
        }

        scanner.close();
    }



}
