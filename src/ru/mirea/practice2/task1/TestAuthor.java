package ru.mirea.practice2.task1;

import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter author's name");
        String name = sc.nextLine();
        System.out.println("Enter author's email");
        String email = sc.nextLine();
        System.out.println("Enter author's gender");
        char gender = sc.nextLine().charAt(0);
        author Author = new author(name, email, gender);
        System.out.println("Information about current author:");
        System.out.printf("Name: %s Email: %s, Gender: %c%n", Author.getName(), Author.getEmail(), Author.getGender());
        System.out.println("Enter new email");
        email = sc.nextLine();
        Author.setEmail(email);
        System.out.println("Updated information about current author:");
        System.out.printf("Name: %s Email: %s, Gender: %c%n", Author.getName(), Author.getEmail(), Author.getGender());
        System.out.println("Class info: " + Author);
    }
}
