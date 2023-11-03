package ru.mirea.practice20.task4_1;

public class Calculator {
    public static <T extends Number> void sum(T num1, T num2) {
        System.out.println(num1.doubleValue() + num2.doubleValue());
    }

    public static <T extends Number> void multiply(T num1, T num2) {
        System.out.println( num1.doubleValue() * num2.doubleValue());
    }

    public static <T extends Number> void divide(T num1, T num2) {
        if (num2.doubleValue() != 0) {
            System.out.println(num1.doubleValue() / num2.doubleValue());
        }
        else {
            System.out.println("Cant divide by zero!");
        }
    }

    public static <T extends Number> void subtract(T num1, T num2) {
        System.out.println(num1.doubleValue() - num2.doubleValue());
    }
}