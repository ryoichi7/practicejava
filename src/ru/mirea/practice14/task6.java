package ru.mirea.practice14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input email (user@example.com)");
        String text = scanner.next();

        Pattern pattern = Pattern.compile("(\\w{2,})@(\\w{2,}\\.\\w{2,})");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            System.out.println("Found an email: " + matcher.group());
        }
        else System.out.println("Wrong email format!");
    }
}
