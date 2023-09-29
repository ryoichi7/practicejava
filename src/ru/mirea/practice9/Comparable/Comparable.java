package ru.mirea.practice9.Comparable;

class Student implements Comparable<Student>{
    public int GPA;
    public String name;

    public Student(int GPA, String name) {
        this.GPA = GPA;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name) + (Integer.compare(this.GPA, o.GPA));
    }
}

class Tester{
    public static void main(String[] args) {
        Student first = new Student(123, "Ken");
        Student second = new Student(456, "Kennedy");

        System.out.println(first.compareTo(second));

        first = new Student(45, "Ken");
        second = new Student(45, "Ken");

        System.out.println(first.compareTo(second));

    }
}
