package ru.mirea.practice1;

import java.util.Scanner;

public class prac1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.println("Enter integer\n");
        if (sc.hasNextInt()){
            length = sc.nextInt();
            int[] array = new int[length];
            int SumArray = 0;
            for (int i = 0; i < length; ++i) {
                if (sc.hasNextInt())
                {
                    array[i] = sc.nextInt();
                }
                else array[i] = 0;
                SumArray += array[i];
            }
            System.out.printf("Sum : ");
            System.out.print(SumArray);
            System.out.printf(" arithmetical mean: ");
            System.out.print(SumArray/length);
        }
        else {
            System.out.println("Wrong data\n");
        }
    }
}
