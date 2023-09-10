package ru.mirea.practice2.task5;

public class Dog {

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getHumanAge(){
        return this.age * 7;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
