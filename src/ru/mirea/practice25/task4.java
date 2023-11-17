package ru.mirea.practice25;

import java.util.Scanner;

class ExpressionChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expression = scanner.nextLine();
        System.out.println(check(expression));
    }

    private static boolean check(String s) {
        return 0 == s.chars()
                .mapToObj(Character::toString)
                .filter("()"::contains)
                .map("("::equals)
                .mapToInt(b -> b ? 1 : -1)
                .reduce(0, (x, y) -> (x >= 0 && x + y >= 0) ? x + y : -1);
    }
}
