package ru.mirea.practice8;

public class Palindrome {
    public static String palindrome(String str, int start, int end) {
        if (start >= end) {
            return "YES";
        }
        if (str.charAt(start) == str.charAt(end)) {
            return palindrome(str, start + 1, end - 1);
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        System.out.println(palindrome("abba", 0, 3));
    }
}
