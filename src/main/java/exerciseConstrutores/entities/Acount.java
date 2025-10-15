package exerciseConstrutores.entities;

import java.util.Objects;

public class Acount {
    public int number;
    public String holder;
    public double balance;

    public Acount(int number, String holder, double initialValue) {
        this.number = number;
        this.holder = holder;
        this.balance = initialValue;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        double tax = 5.00;
        balance -= amount + tax;
    }


    @Override
    public String toString() {
        return "Account " + number +
                ", Holder: " + holder +
                ", Balance: $ " + String.format("%.2f", balance);
    }
}
