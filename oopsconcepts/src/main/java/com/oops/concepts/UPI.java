package com.oops.concepts;

public class UPI implements Payment {

    public void payment(double amount) {
        System.out.println("Payment done of amount: " + amount + " by UPI");
    }

    public String paymentWay() {
        return "Payment by UPI";
    }
}
