package ru.mirea.practice2.task4;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Scanner;
public class Shop {
    private ArrayList<String> PcArray;
    public void FindPc(String PcName){
        for (int i = 0; i < PcArray.size(); ++i)
            if (Objects.equals(PcArray.get(i), PcName)){
                System.out.printf("PC: %s has been successfully found, it's specified number is %d\n", PcName, i);
            }
        System.out.printf("PC: %s is not found\n", PcName);
    }

    public void add(String PcName){
        PcArray.add(PcName);
        System.out.printf("PC: %s has been successfully added to the list\n", PcName);
    }

    public void remove(String PcName){
        PcArray.remove(PcName);
        System.out.printf("PC: %s has been successfully removed from the list\n", PcName);
    }

    Shop (){
        PcArray = new ArrayList<String>();
    }
}
