package main.java.composite.examples;

/**
 * Created by Chalauri-G on 9/19/2017.
 */
public class Main {

    public static void main(String[] args) {
        //expression = ((3+5)*100)/(2+64)
        Expression expression = new Divider(
                new Multiplier(
                        new Adder(new Constant(3.0), new Constant(5.0)),
                        new Constant(100.0)
                ), new Adder(
                new Constant(2.0),
                new Constant(64.0))
        );

        System.out.println(expression.getValue());
    }
}
