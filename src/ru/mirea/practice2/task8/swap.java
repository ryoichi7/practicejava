package ru.mirea.practice2.task8;

import java.util.Scanner;
public class swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] mas = new String[10];
        for (int i = 0; i < 10; ++i){
            mas[i] = sc.next();
        }
        for (int i = 0; i < 10; ++i){
            System.out.print(mas[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < 5; ++i){
            String tmp = mas[9 - i];
            mas[9 - i] = mas[i];
            mas[i] = tmp;
        }
        for (int i = 0; i < 10; ++i){
            System.out.print(mas[i] + "\t");
        }
    }
}
