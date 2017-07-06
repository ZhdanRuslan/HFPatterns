package ch3_decorator.own_decorator;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 2.02;
    }
}
