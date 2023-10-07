package ru.mirea.practice13;

import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        getString(line);
    }

    public static void getString(String arg){
        System.out.println("Last char: " + arg.charAt(arg.length() - 1));
        System.out.println("String ends with \"!!!\": " + arg.endsWith("!!!"));
        System.out.println("String starts with \"I like\": " + arg.startsWith("I like"));
        System.out.println("String contains \"Java\": " + arg.contains("Java"));
        int index = arg.indexOf("Java");
        System.out.println("IndexOf Java: " + index);
        System.out.println("New String: " + arg.replace('a', 'o'));
        System.out.println("String to UpperCase: " + arg.toUpperCase());
        System.out.println("String to LowerCase: " + arg.toLowerCase());
        System.out.println(arg.substring(index, index + 4));
    }
}
