package com.oops.concepts;

import java.util.List;

public class Main {

    // Main is the starting point of code
    public static void main(String[] args) {
        System.out.println("Bank Account");
        BankAccount bankAccount = new BankAccount("123456789", "John Doe", 1000.0);
        bankAccount.displayAccount();
        bankAccount.deposit(500.0);
        bankAccount.withdraw(200.0);
        bankAccount.displayAccount();

        System.out.println("***************");
        System.out.println("Savings Account");
        SavingsAccount savingsAccount = new SavingsAccount("123456788", "Sendil", 1000.0, 3.5);
        savingsAccount.displayAccount();
        savingsAccount.deposit(500.0);
        System.out.println(savingsAccount.withdraw(1450.0));
        savingsAccount.displayAccount();

        System.out.println("*******************");
        System.out.println("Checking Account");
        CheckingAccount checkingAccount = new CheckingAccount("123456787", "John", 1000.0, 100.0);
        checkingAccount.displayAccount();
        checkingAccount.deposit(500.0);
        checkingAccount.withdraw(200.0);
        checkingAccount.displayAccount();

    }
}