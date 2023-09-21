package ru.mirea.practice6.Shop;

import java.util.Scanner;
import java.util.ArrayList;

enum Computer{
    AMD(3800, 3200, 144){
        void showPcInfo(){
            System.out.print("PC: AMD ");
            pr.showSpecification();
            mem.showSpecification();
            mon.showSpecification();
        }
    },
    Intel(4200, 3200, 120){
        void showPcInfo(){
            System.out.print("PC: Intel ");
            pr.showSpecification();
            mem.showSpecification();
            mon.showSpecification();
        }
    };

    void showPcInfo(){}
    final Processor pr;
    final Memory mem;
    final Monitor mon;
    Computer(int clockRate, int ramFrequency, int refreshRate)
    {
        pr = new Processor(clockRate);
        mem = new Memory(ramFrequency);
        mon = new Monitor(refreshRate);
    }
}

interface infoGetter{
    void showSpecification();
}

class Processor implements infoGetter{
    int clockRate;
    Processor(int clockRate){this.clockRate = clockRate;}

    @Override
    public void showSpecification(){
        System.out.printf("Clock rate: %d ", clockRate);
    }
}

class Memory implements infoGetter{
    int ramFrequency;
    Memory (int ramFrequency){this.ramFrequency = ramFrequency;}
    @Override
    public void showSpecification(){
        System.out.printf("RAM frequency: %d ", ramFrequency);
    }
}

class Monitor implements  infoGetter{
    int refreshRate;
    Monitor(int refreshRate){this.refreshRate = refreshRate;}
    @Override
    public void showSpecification(){
        System.out.printf("Refresh rate: %d ", refreshRate);
    }
}

public class Shop {
    public static void main(String[] args){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shop list size");
        size = sc.nextInt();
        Shop shop = new Shop(size);
        shop.findPc(4200,3200,120);
        shop.deletePc(0);
        shop.findPc(4200,3200,120);
        shop.addPc();
        shop.findPc(4200,3200,120);
    }
    ArrayList<Computer> pcArr = new ArrayList<>();
    int size;
    Shop(int size){
        for (int i = 0; i < size; ++i){
            if (i % 2 == 0) {
                pcArr.add(Computer.AMD);
            }
            else {
                pcArr.add(Computer.Intel);
            }
        }
        this.size = size;
    }
    void addPc(){
        int i = (int) (Math.random() * 2);
        if (i % 2 == 0) {
            pcArr.add(Computer.AMD);
            System.out.println("The computer has been added");
        }
        else {
            pcArr.add(Computer.Intel);
        }
        size++;
    }

    void findPc(int clockRate, int ramFrequency, int refreshRate){
        for (Computer i : pcArr){
            if (i.mem.ramFrequency == ramFrequency && i.mon.refreshRate == refreshRate && i.pr.clockRate == clockRate) {
                i.showPcInfo();
                System.out.println("The computer has been found");
            }
        }
    }
    void deletePc(int index){
        pcArr.get(index).showPcInfo();
        System.out.println("The computer has been removed");
        pcArr.remove(index);
    }
}
