package ru.mirea.practice20.task4_1;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Calculator.sum(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
        Calculator.subtract(a, b);
    }
}
