package ru.mirea.practice14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input date (dd/mm/yyyy), 1899 < yyyy < 9999");
        String text = scanner.next();

        Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19[0-9]{2}|\\d{4})");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            System.out.println("Found a date: " + matcher.group());
        }
        else System.out.println("Wrong data format!");
    }
}
