package com.oops.concepts;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Double> items = new HashMap<>();
    private boolean discountApplied;
    private boolean isCheckout;

    public void addItem(String item, double price) {
        if(!isCheckout) {
            items.put(item, price);
        }
    }

    public boolean applyDiscount(String code) {
        if(code.equals("SAVE10") && !discountApplied  && !isCheckout) {
            discountApplied = true;
            return true;
        }

        return false;
    }

    public double getTotal() {
        double sum = 0.0;
        for (double price : items.values()) {
            sum += price;
        }

        if (discountApplied) {
            sum *=0.9;
        }
        return sum;
    }

    public void checkout() {
        if (!items.isEmpty() && !isCheckout) {
            isCheckout = true;
        }
    }

}
