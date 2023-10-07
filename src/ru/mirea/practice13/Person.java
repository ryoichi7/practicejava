package ru.mirea.practice13;

public class Person {
    private String name;
    private String lastName;

    Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    Person(String name) {
        this.name = name;
    }

    public void getFullName(){
        if (lastName == null){
            System.out.println(name);
            return;
        }
        System.out.println(name + " " + lastName);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Micheal", "Jordan");
        Person person2 = new Person("Michael");
        person1.getFullName();
        person2.getFullName();
    }
}
