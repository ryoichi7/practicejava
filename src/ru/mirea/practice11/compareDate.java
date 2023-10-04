package ru.mirea.practice11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class compareDate {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

        Date currentTime = new Date(System.currentTimeMillis());
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time (hours:minutes): ");
        String userInput = scanner.nextLine();

        try {
            Date userDate = dateFormat.parse(userInput);

            String cur = dateFormat.format(currentTime);
            String user = dateFormat.format(userDate);
            int comparisonResult = user.compareTo(cur);

            if (comparisonResult < 0) {
                System.out.println("The entered time is in the past.");
            } else if (comparisonResult > 0) {
                System.out.println("The entered time is in the future.");
            } else {
                System.out.println("The entered time is the same as the current time.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input format. Please use the HH:mm format.");
        }
        scanner.close();
    }
}
