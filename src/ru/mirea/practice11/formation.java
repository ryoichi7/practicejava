package ru.mirea.practice11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class formation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year, month and day (YYYY MM DD):");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();


        System.out.println("Enter hours and minutes (HH MM):");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();


        Date date = createDate(year, month, day);

        Calendar calendar = createCalendar(year, month, day, hours, minutes);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat CalendarFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Date: " + dateFormat.format(date));
        System.out.println("Calendar: " + CalendarFormat.format(calendar.getTime()));

        scanner.close();
    }

    private static Date createDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.getTime();
    }

    private static Calendar createCalendar(int year, int month, int day, int hours, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes);
        return calendar;
    }
}