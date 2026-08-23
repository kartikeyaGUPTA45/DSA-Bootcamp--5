package com.oops.concepts;

public class CheckingAccount extends BankAccount {
    protected double overdraftLimit;

    public CheckingAccount(String accountNumber, String ownerName, double balance, double overdraftLimit) {
        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (this.balance + this.overdraftLimit >= amount) {
            this.balance-= amount;
            return true;
        }
        return false;
    }
}
