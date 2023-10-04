package ru.mirea.practice10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String speciality;
    private int course;
    private String group;

    public String toString(){
        return firstName + " " + lastName + " " + speciality + " " + course + " " + group + " " + GPA;
    }
    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    private int GPA;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(String firstName, String lastName, String speciality, int course, String group, int GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
    }
}

class SortingStudentsByGPA{

    public static void main(String[] args) {
        SortingStudentsByGPA students = new SortingStudentsByGPA();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        students.setArray(size);
        students.outArray();
        students.quickSortByGPA(0,size - 1);
        students.outArray();
        students.quickSortByCourse(0, size - 1);
        students.outArray();
    }
    private ArrayList<Student> students = new ArrayList<>();
    public void setArray(int size){
        Random rand = new Random();
        for (int i = 0; i < size; ++i){
            students.add(new Student("Frank" + i, "McDonald" + i, "speciality" + i, rand.nextInt(1,5),
                    "group" + i, rand.nextInt(1,301)));
        }
    }
    public void outArray(){
        for (Student st : students){
            System.out.println(st);
        }
        System.out.println("------------------------------------------");
    }

    public void quickSortByGPA(int leftBorder, int rightBorder){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = students.get((leftMarker + rightMarker) / 2);
        Comparator<Student> comp = new StudentComparatorGPA();
        do {
            while (comp.compare(students.get(leftMarker), pivot) < 0){
                leftMarker++;
            }
            while(comp.compare(students.get(rightMarker), pivot) > 0){
                rightMarker--;
            }
            if (leftMarker <= rightMarker){
                if (leftMarker < rightMarker){
                    Student tmp = students.get(leftMarker);
                    students.set(leftMarker, students.get(rightMarker));
                    students.set(rightMarker, tmp);
                }
                leftMarker++;
                rightMarker--;
            }
        }while(leftMarker <= rightMarker);

        if (leftMarker < rightBorder){
            quickSortByGPA(leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker){
            quickSortByGPA(leftBorder, rightMarker);
        }
    }

    public void quickSortByCourse(int leftBorder, int rightBorder){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = students.get((leftMarker + rightMarker) / 2);
        Comparator<Student> comp = new StudentComparatorCourse();
        do {
            while (comp.compare(students.get(leftMarker), pivot) < 0){
                leftMarker++;
            }
            while(comp.compare(students.get(rightMarker), pivot) > 0){
                rightMarker--;
            }
            if (leftMarker <= rightMarker){
                if (leftMarker < rightMarker){
                    Student tmp = students.get(leftMarker);
                    students.set(leftMarker, students.get(rightMarker));
                    students.set(rightMarker, tmp);
                }
                leftMarker++;
                rightMarker--;
            }
        }while(leftMarker <= rightMarker);

        if (leftMarker < rightBorder){
            quickSortByGPA(leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker){
            quickSortByGPA(leftBorder, rightMarker);
        }
    }
}

class StudentComparatorGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getGPA() - o1.getGPA();
    }
}

class StudentComparatorCourse implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse() - o2.getCourse();
    }
}