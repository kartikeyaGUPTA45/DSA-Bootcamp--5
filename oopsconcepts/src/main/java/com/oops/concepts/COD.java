package com.oops.concepts;

public class COD implements Payment {

    public void payment(double amount) {
        System.out.println("Payment done of amount: " + amount + " by COD");
    }

    public String paymentWay() {
        return "Payment by COD";
    }
}
