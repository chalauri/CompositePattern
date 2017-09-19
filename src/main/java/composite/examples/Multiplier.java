package main.java.composite.examples;

/**
 * Created by Chalauri-G on 9/19/2017.
 */
public class Multiplier extends BinaryExpression {

    public Multiplier(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return this.left.getValue() * this.right.getValue();
    }
}
