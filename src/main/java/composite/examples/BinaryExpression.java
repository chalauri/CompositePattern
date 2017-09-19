package main.java.composite.examples;

/**
 * Created by Chalauri-G on 9/19/2017.
 */
public abstract class BinaryExpression implements Expression {

    protected Expression left;
    protected Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

}
