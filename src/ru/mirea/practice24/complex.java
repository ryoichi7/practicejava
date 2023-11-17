package ru.mirea.practice24;

import java.util.Scanner;

interface ComplexAbstractFactory {
    public Complex createComplex();
    public Complex CreateComplex(double real,double image);
}

class Complex {
    private double real;
    private double image;

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }
}

class ConcreteFactory implements ComplexAbstractFactory{
    @Override
    public Complex createComplex() {
        return new Complex(0,0);
    }

    @Override
    public Complex CreateComplex(double real, double image) {
        return new Complex(real,image);
    }
}

class TestComplex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values of complex number: ");
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Complex complex = concreteFactory.CreateComplex(scanner.nextDouble(),scanner.nextDouble());
        System.out.println("Complex number: " + complex.getReal() + " + " + complex.getImage() + "i");
    }
}
