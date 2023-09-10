package ru.mirea.practice3.task1;

import java.util.Random;
public class prac3_1 {
    public static void main(String[] args){
        Random rand = new Random();
        int size = rand.nextInt(10);
        int[] array = new int[size];
        for (int i = 0; i < size; ++i){
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < size - 1; ++i){
            for (int j = i + 1; j < size; ++j){
                if (array[i] > array[j]){
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        for (int i = 0; i < size; ++i){
            System.out.print(array[i] + " ");
        }
    }
}
