package ru.mirea.practice11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class lastName {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm::ss");

        Date start = new Date(System.currentTimeMillis());
        String lastName = "Samoylov";
        Thread.sleep(rand.nextInt(500,5000));
        Date end = new Date(System.currentTimeMillis());

        System.out.printf("Last name: %s\n", lastName);
        System.out.println("Work start time: " + dateFormat.format(start));
        System.out.println("Work end time: " + dateFormat.format(end));
    }
}