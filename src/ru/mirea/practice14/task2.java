package ru.mirea.practice14;

import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String regex = "^abcdefghijklmnopqrstuv18340$";
        if (input.matches(regex)){
            System.out.println("Match");
        }
        else{
            System.out.println("No match");
        }
    }
}