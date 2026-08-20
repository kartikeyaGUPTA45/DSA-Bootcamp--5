package com.oops.concepts;

public enum Coins {
    ONE(1, "one coin"),
    TWO(2, "two coin"),
    FIVE(5, "five coin"),
    TEN(10, "ten coin"),
    TWENTY(20, "twenty coin");

    public int value;
    public String description;

    Coins(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return this.value;
    }

    public String getDescription() {
        return this.description;
    }

    public static int getCoinSum() {
        int coinSum = 0;
        for(Coins coin : Coins.values()) {
            coinSum += coin.getValue();
        }
        return coinSum;
    }
}
