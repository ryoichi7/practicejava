package ru.mirea.practice9.test;

import java.util.Arrays;
import java.util.Scanner;

class Student{
    int id;
    Student (int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return Integer.toString(id);
    }
}
public class test {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Student[] students = new Student[n];
        for (int i = 0; i < n; ++i) students[i] = new Student((int) (Math.random() * 10000));

        System.out.println(Arrays.toString(students) + " - Student's ids");

        for (int left = 0; left < students.length; left++) {
            Student value = students[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.id < students[i].id) {
                    students[i + 1] = students[i];
                } else break;
            }
            students[i + 1] = value;
        }

        System.out.println(Arrays.toString(students) + " - Student's ids");
    }
}
