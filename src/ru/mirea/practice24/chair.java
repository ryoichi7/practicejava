package ru.mirea.practice24;

import java.util.Scanner;
interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicChair();
    public FunctionalChair createFunctionalChair();
}

interface Chair {
}

class ChairFactory implements AbstractChairFactory{
    private Scanner scanner = new Scanner(System.in);
    @Override
    public VictorianChair createVictorianChair() {
        System.out.print("Enter age of chair: ");
        return new VictorianChair(scanner.nextInt());
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}

class Client {
    public Chair chair;

    public void sit(){
        System.out.println("Sitting...");
    }

    public void setChair(Chair chair){
        this.chair = chair;
    }
}

class FunctionalChair implements Chair{
    public int sum(int a,int b){
        return a + b;
    }
}

class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("Magic...");
    }
}

class VictorianChair implements Chair{
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "VictorianChair{" +
                "age=" + age +
                '}';
    }
}

class TestChair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chair chair;
        ChairFactory chairFactory = new ChairFactory();
        System.out.print("Enter type of chair: ");
        String type = scanner.next();
        switch (type.toLowerCase()){
            case("victorian")->{
                chair = chairFactory.createVictorianChair();
                System.out.println(chair);
            }
            case("magic")->{
                chair = chairFactory.createMagicChair();
                MagicChair magicChair = new MagicChair();
                magicChair.doMagic();
            }
            case("functional")->{
                chair = chairFactory.createFunctionalChair();
                System.out.println(((FunctionalChair) chair).sum(10, 20));
            }
        }
    }
}
