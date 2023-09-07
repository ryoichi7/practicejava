package ru.mirea.practice1;

import java.util.Scanner;
public class prac1_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double harmonic = 0;
        for (double i = 1; i < 11; ++i){
            harmonic += 1/i;
            System.out.println(harmonic);
        }
    }
}
