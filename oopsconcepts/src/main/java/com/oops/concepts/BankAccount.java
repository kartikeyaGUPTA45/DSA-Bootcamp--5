package com.oops.concepts;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public BankAccount() {

    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount: " + amount + " deposit successfully");
        }
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance-= amount;
            return true;
        }

        return false;
    }

    public double getBalance() {
        return this.balance;
    }
}
