package main.java.composite.examples;

/**
 * Created by Chalauri-G on 9/19/2017.
 */
public class Subtracter extends BinaryExpression {

    public Subtracter(Expression left, Expression right) {
        super(left,right);
    }

    @Override
    public double getValue() {
        return this.left.getValue() - this.right.getValue();
    }

}
