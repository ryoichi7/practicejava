package ru.mirea.practice14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static void main(String[] args) {
        String text1 = "(1 + 8) – 9 / 4";
        String text2 = "6 / 5 – 2 * 9";

        System.out.println("Total number of entries: " + findEntries(text1) + "\n");
        System.out.println("Total number of entries: " + findEntries(text2));
    }


    public static int findEntries(String text){

        int matcherCount = 0;

        Pattern pattern = Pattern.compile("\\d+(\\+|\\s+\\+)");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Test text to find entries:");
        System.out.println(text);
        System.out.println("Entries:");
        while(matcher.find()){
            System.out.println(matcher.group());
            matcherCount++;
        }

        return matcherCount;
    }
}
