package ru.mirea.practice2.task5;

import java.util.Scanner;
public class DogNursery {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of dogs\n");
        int count = sc.nextInt();
        Dog[] dogList = new Dog[count];
        for (int i = 0; i < count; ++i){
            System.out.print("Enter the dog's name and age\n");
            String name = sc.next();
            int age = sc.nextInt();
            dogList[i] = new Dog(name,age);
        }
        for (int i = 0; i < count; ++i){
            System.out.printf("Dog %d/%d information\n", i + 1, count);
            System.out.printf("Name: %s, Age: %d, HumanAge: %d\n",dogList[i].getName(), dogList[i].getAge(), dogList[i].getHumanAge());
            System.out.printf("Object description: %s\n", dogList[i].toString());
        }
    }
}
