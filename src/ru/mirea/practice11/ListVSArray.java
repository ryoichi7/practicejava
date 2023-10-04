package ru.mirea.practice11;

import java.util.ArrayList;
        import java.util.LinkedList;
        import java.util.List;
        import java.util.Random;

public class ListVSArray {
    public static void main(String[] args) {

        int dataSize = 100000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Random random = new Random();
        for (int i = 0; i < dataSize; i++) {
            int randomNumber = random.nextInt(dataSize);
            arrayList.add(randomNumber);
            linkedList.add(randomNumber);
        }

        long startTime = System.nanoTime();
        arrayList.add(0, 9999);
        long endTime = System.nanoTime();
        System.out.println("front add in ArrayList - " + (endTime - startTime) + " nanos");

        startTime = System.nanoTime();
        linkedList.add(0, 9999);
        endTime = System.nanoTime();
        System.out.println("front add in LinkedList - " + (endTime - startTime) + " nanos");



        startTime = System.nanoTime();
        arrayList.remove(dataSize / 2);
        endTime = System.nanoTime();
        System.out.println("removal from the middle of ArrayList - " + (endTime - startTime) + " nanos");

        startTime = System.nanoTime();
        linkedList.remove(dataSize / 2);
        endTime = System.nanoTime();
        System.out.println("removal from the middle of LinkedList - " + (endTime - startTime) + " nanos");



        startTime = System.nanoTime();
        arrayList.add(dataSize - 1, 9999);
        endTime = System.nanoTime();
        System.out.println("back add in ArrayList - " + (endTime - startTime) + " nanos");

        startTime = System.nanoTime();
        linkedList.add(dataSize - 1, 9999);
        endTime = System.nanoTime();
        System.out.println("back add in LinkedList - " + (endTime - startTime) + " nanos");



        int searchElement = random.nextInt(dataSize);
        startTime = System.nanoTime();
        arrayList.contains(searchElement);
        endTime = System.nanoTime();
        System.out.println("Search in ArrayList - " + (endTime - startTime) + " nanos");

        startTime = System.nanoTime();
        linkedList.contains(searchElement);
        endTime = System.nanoTime();
        System.out.println("Search in LinkedList - " + (endTime - startTime) + " nanos");
    }
}