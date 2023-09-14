package ru.mirea.practice4._1;

public class Phone {
    public static void main(String[] args){
        Phone n1 = new Phone(777,"Samsung", 172.3);
        Phone n2 = new Phone(666,"Iphone", 165.7);
        Phone n3 = new Phone(123,"Huawei", 156.4);
        System.out.println("Model: Number: Weight:");
        System.out.println(n1.getModel() + " "+ n1.getNumber() + " " + n1.getWeight());
        System.out.println(n2.getModel() + " "+ n2.getNumber() + " " + n2.getWeight());
        System.out.println(n3.getModel() + " "+ n3.getNumber() + " " + n3.getWeight());
        n1.receiveCall(n2.getModel());
        n2.receiveCall(n3.getModel());
        n3.receiveCall(n1.getModel());
        n1.receiveCall(n2.getModel(), n2.getNumber());
        n2.sendMessage(n1.getNumber(), n3.getNumber());
    }
    public  void sendMessage(int...numbers){
        for (int i : numbers){
            System.out.printf("Message to +%d\n", i);
        }
    }
    Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }
    Phone(int number, String model){
        this.number = number;
        this.model = model;
        weight = -1;
    }
    Phone(){
        number = -1;
        model = "unknown";
        weight = -1;
    }
    public void receiveCall(String name){
        System.out.printf("%s is calling...\n", name);
    }
    public void receiveCall(String name, int number){
        System.out.printf("%s is calling...\n +%d\n", name, number);
    }
    public int getNumber() {
        return number;
    }
    private int number;

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    private String model;
    private double weight;


}
