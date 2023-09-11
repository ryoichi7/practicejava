package ru.mirea.practice3.random.task4;

import java.util.Scanner;
public class prac3_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number that is natural and greater than zero");
        while (true){
            if (sc.hasNextInt()){
                n = sc.nextInt();
                if (n >= 1){
                    break;
                }
                else System.out.println("Wrong data, please, enter a number that is natural and greater than zero");
            }
            else{
                sc.next();
                System.out.println("Wrong data, please, enter a number that is natural and greater than zero");
            }
        }
        int[] arr = new int[n];
        int[] evenArr = new int[n];
        int evenCounter = 0;
        for (int i = 0; i < n; ++i){
            arr[i] = (int)(Math.random() * (n + 1));
            if (arr[i] % 2 == 0){
                evenArr[evenCounter] = arr[i];
                ++evenCounter;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("<-- random array");
        for (int i = 0; i < evenCounter; ++i){
            System.out.print(evenArr[i] + " ");
        }
        System.out.println("<-- random even array");
    }
}
