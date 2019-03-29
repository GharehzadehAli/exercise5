package com.company;

public class MetalElement extends Element {
    MetalElement(String symbol, int number, double weight) {
        super(symbol, number, weight);
    }

    @Override
    public void describeElement() {
        System.out.println("atomic symbol: " + getSymbol() + "\n" + "atomic number: " + getNumber() + "\n" + "weight: " + getWeight() + "\nmetals are good conductors of electricity");
    }
}
