package main.java.composite.examples;

/**
 * Created by Chalauri-G on 9/19/2017.
 */
public class Constant implements Expression {

    private double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return this.value;
    }
}
