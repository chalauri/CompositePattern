package main.java.composite.examples;

/**
 * Created by Chalauri-G on 9/19/2017.
 */
public class Divider implements Expression {
    private Expression left;
    private Expression right;

    public Divider(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double getValue() {
        return this.left.getValue() / this.right.getValue();
    }
}
