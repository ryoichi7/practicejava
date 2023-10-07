package ru.mirea.practice13;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFormat {
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String number;

    public NumberFormat(String number) {
        Pattern pattern = Pattern.compile("(\\+7|8)(\\d{10})");
        Matcher matcher = pattern.matcher(number);
        if (matcher.find()) this.number = "+7" + matcher.group(2);
        else this.number = "NaN";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        NumberFormat numberFormat = new NumberFormat(a);
        System.out.println(numberFormat.getNumber());
    }
}
