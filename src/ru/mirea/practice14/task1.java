package ru.mirea.practice14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string");
        String string = scanner.next();
        System.out.println("Input pattern");
        String userPattern = scanner.next();
        Pattern pattern = Pattern.compile(userPattern);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()){
            System.out.println("Found occurrence:" + matcher.group());
        }
        System.out.println("No occurrences left in the string");
    }
}
