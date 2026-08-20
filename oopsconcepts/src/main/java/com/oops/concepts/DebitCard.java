package com.oops.concepts;

public class DebitCard implements Payment {

    @Override // -> Annotations
    public void payment(double amount) {
        System.out.println("Payment done of amount: " + amount + " by Debit Card");
    }

    public String paymentWay() {
        return "Payment by Debit Card";
    }
}
