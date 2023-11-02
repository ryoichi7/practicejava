package ru.mirea.practice19;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student{
    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    private int GPA;
    private String name;
    public Student (int GPA, String name){
        this.GPA = GPA;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + GPA;
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

    public static String findStudentByName(String name, Student[] students) throws StudentNotFoundException{
        for (int i = 0; i < students.length; ++i){
            if (students[i].getName().equals(name)){
                return "Student " + students[i].toString() + " has been found";
            }
        }
        throw new StudentNotFoundException("No such student in students list", new Throwable("BadRequest"));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < 5; ++i){
            students[i] = new Student((int)(Math.random() * 10), "Student" + i);
        }
        System.out.println("Students initial array: " + Arrays.toString(students));
        quickSort(students, 0, students.length - 1);
        System.out.println("Students sorted array: " + Arrays.toString(students));

        System.out.println("Type student's name to find his GPA");
        String name = scanner.next();

        try{
            System.out.println(findStudentByName(name, students));
        }catch (StudentNotFoundException exception){
            System.out.println(exception.getCause().getMessage());
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Program has been finished successfully");
        }
    }
}

