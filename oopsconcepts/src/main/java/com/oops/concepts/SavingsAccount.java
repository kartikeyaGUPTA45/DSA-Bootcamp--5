package com.oops.concepts;

public class SavingsAccount extends BankAccount {

    protected double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }
// account => 500-100 => 400 >= amount
    @Override
    public boolean withdraw(double amount) {
        if (this.balance-100 >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public double applyInterest() {
        return this.balance += (this.balance * this.interestRate)/100;
    }
}
