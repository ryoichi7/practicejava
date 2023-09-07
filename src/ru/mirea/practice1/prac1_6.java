package ru.mirea.practice1;

public class prac1_6 {
    public static void main(String[] args){
        double harmonic = 0;
        for (double i = 1; i < 11; ++i){
            harmonic += 1/i;
            System.out.println(harmonic);
        }
    }
}
