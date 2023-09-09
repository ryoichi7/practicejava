package ru.mirea.practice1;

import java.util.Scanner;

public class prac1_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.println("Enter integer\n");
        if (sc.hasNextInt()){
            length = sc.nextInt();
            int[] array = new int[length];
            int SumArray = 0;
            int i = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            while (i < length) {
                if (sc.hasNextInt()) {
                    array[i] = sc.nextInt();
                    if (array[i] > max) {
                        max = array[i];
                    }
                    if (array[i] < min){
                        min = array[i];
                    }
                }
                else array[i] = 0;
                SumArray += array[i];
                ++i;
            }
            System.out.printf("Sum: ");
            System.out.print(SumArray);
            System.out.printf("\nMin: ");
            System.out.print(min);
            System.out.printf("\nMax: ");
            System.out.print(max);
        }
        else {
            System.out.println("Wrong data\n");
        }
    }
}