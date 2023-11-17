package ru.mirea.practice26;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        String[] strings = {"one", "two", "three", "four", "five", "six"};
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            hashMap.put(integers[i], strings[i]);
        }
        System.out.println(hashMap);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        System.out.println(hashMap.get(scanner.nextInt()));

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Arrays.stream(integers).toList());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
    }
}
