package ru.mirea.practice22;

public class Operation {
    public static double getResult(double number1,double number2,String operation) throws Exception {
        switch (operation) {
            case ("+") -> {
                return number2 + number1;
            }
            case ("-") -> {
                return number2 - number1;
            }
            case ("*") -> {
                return number2 * number1;
            }
            case ("/") -> {
                return number2 / number1;
            }
            default -> {
                throw new Exception("No such operation");
            }
        }
    }
}

