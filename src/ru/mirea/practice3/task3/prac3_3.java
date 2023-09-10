package ru.mirea.practice3.task3;

public class prac3_3 {
    public static void main(String[] args){
        int[] array = new int[4];
        for (int i = 0; i < 4; ++i){
            array[i] = (int)(Math.random() * 90 + 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3]){
            System.out.println("this is a strictly increasing sequence");
        }
        else System.out.println("this isn't a strictly increasing sequence");
    }
}
