package com.company;

public class NonMetalElement extends Element {
    NonMetalElement(String symbol, int number, double weight) {
        super(symbol, number, weight);
    }

    @Override
    public void describeElement() {
        System.out.println("atomic symbol: " + getSymbol() + "\n" + "atomic number: " + getNumber() + "\n" + "weight: " + getWeight() + "\nnonmetals are poor conductors");
    }
}
