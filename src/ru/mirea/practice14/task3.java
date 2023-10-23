package ru.mirea.practice14;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {

        String text = "Some text: 100.50 USD, 5000.00 RUB, 80.75 EUR и еще 200.25 USD , 500.5000 USD, 123.123 ERR";

        Pattern pattern = Pattern.compile("\\d+\\.\\d+ (USD|RUB|EUR)");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Test text to find entries:");
        System.out.println(text);
        System.out.println("Entries");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
