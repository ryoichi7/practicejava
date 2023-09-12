package ru.mirea.practice3.format.task3;

import java.util.Scanner;

public class report {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        employee[] list = new employee[5];
        for (int i = 0; i < 5; ++i){
            System.out.printf("Enter employee's %d/5 full name\n", i + 1);
            String name = sc.nextLine();
            list[i] = new employee(name, Math.random() * 1000000);
        }
        report.generateReport(list);
    }
    public static void generateReport(employee[] list){
        for (int i = 0; i < 5; ++i){
            System.out.printf("Full name: " + list[i].fullName + String.format("%175s", "Salary:  " + "%.2f USD\n"), list[i].salary);
        }
    }
}
