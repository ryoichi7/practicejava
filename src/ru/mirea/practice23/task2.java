package ru.mirea.practice23;
import java.util.Scanner;


interface Evaluatable {
    public double evaluate(double x);
}

abstract class Operand implements Evaluatable {

}

class Const extends Operand {
    private double value;

    public Const(double value){ this.value = value; }

    @Override
    public double evaluate(double x) {
        return value;
    }
}

class Variable extends Operand {
    public Variable(char symbol){
    }

    @Override
    public double evaluate(double x) {
        return x;
    }
}

abstract class Operation {
    protected Evaluatable firstOperand;
    protected Evaluatable secondOperand;

    public Operation(Evaluatable firstOperand,Evaluatable secondOperand){
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

}

class Add extends Operation implements Evaluatable {

    public Add(Evaluatable firstOperand, Evaluatable secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double evaluate(double x) {
        return firstOperand.evaluate(x) + secondOperand.evaluate(x);
    }
}

class Divide extends Operation implements Evaluatable {

    public Divide(Evaluatable firstOperand, Evaluatable secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double evaluate(double x) {
        return firstOperand.evaluate(x) / secondOperand.evaluate(x);
    }
}

class Multiply extends Operation implements Evaluatable {

    public Multiply(Evaluatable firstOperand, Evaluatable secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double evaluate(double x) {
        return firstOperand.evaluate(x) * secondOperand.evaluate(x);
    }
}

class Subtract extends Operation implements Evaluatable {

    public Subtract(Evaluatable firstOperand, Evaluatable secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double evaluate(double x) {
        return firstOperand.evaluate(x) - secondOperand.evaluate(x);
    }
}

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Multiply xTwo = new Multiply(new Variable('x'),new Variable('x'));
        Multiply twoX = new Multiply(new Const(2),new Variable('x'));
        Subtract xTwoMinusTwoX = new Subtract(xTwo,twoX);
        Add expression = new Add(xTwoMinusTwoX,new Const(1));

        System.out.print("Введите значение x: ");
        double variable = scanner.nextDouble();
        System.out.println("x^2-2x+1 = " + expression.evaluate(variable));
    }
}