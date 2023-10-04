package ru.mirea.practice11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String lastName;
    private int GPA;
    private Date birthDate;

    public Student(String lastName, int Gpa, Date birthDate) {
        this.lastName = lastName;
        this.GPA = Gpa;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String lastName = "LastName: " + this.lastName + "\n";
        String GPA = "GPA: " + this.GPA + "\n";
        String birthDate = "Birth Date: " + dateFormat.format(this.birthDate) + "\n";
        return lastName + GPA + birthDate;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Frank", 123, new Date());
        System.out.println(student);
    }
}