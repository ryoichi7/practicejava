package ru.mirea.practice9.SortingStudentsByGPA;

import java.util.Arrays;
import java.util.Comparator;
class Student{
    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    int GPA;
    Student (int GPA){
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return Integer.toString(GPA);
    }
}
class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare (Student a, Student b){
        return Integer.compare(a.getGPA(), b.getGPA());
    }

    public static void quickSort(Student[] students, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        SortingStudentsByGPA comp = new SortingStudentsByGPA();
        Student pivot = students[(leftMarker + rightMarker) / 2];
        do {
            while (comp.compare(students[leftMarker], pivot) < 0) {
                leftMarker++;
            }
            while (comp.compare(students[rightMarker], pivot) > 0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = students[leftMarker];
                    students[leftMarker] = students[rightMarker];
                    students[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(students, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(students, leftBorder, rightMarker);
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        for (int i = 0; i < 5; ++i){
            students[i] = new Student((int)(Math.random() * 10));
        }
        System.out.println(Arrays.toString(students));
        quickSort(students, 0, 4);
        System.out.println(Arrays.toString(students));
    }
}
