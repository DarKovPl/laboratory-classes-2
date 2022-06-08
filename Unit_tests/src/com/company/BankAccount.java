package com.company;

public class BankAccount {
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.balance = balance;
    }

    public double deposit (double amount) {
        balance += amount;
        return balance;
    }

    public void withdraw (double amount, boolean branch) {
        if ((amount > 500) && !branch )	{
            throw new IllegalArgumentException();
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }


}
