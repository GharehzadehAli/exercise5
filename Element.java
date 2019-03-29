package com.company;

public abstract class Element {
    private String symbol;
    private int number;
    private double weight;

    Element(String symbol, int number, double weight) {
        this.symbol = symbol;
        this.number = number;
        this.weight = weight;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public abstract void describeElement();
}
