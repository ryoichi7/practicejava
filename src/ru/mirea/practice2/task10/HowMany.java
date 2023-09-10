package ru.mirea.practice2.task10;

import java.util.ArrayList;
import java.util.Scanner;
public class HowMany {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words= new ArrayList<>();
        System.out.println("Type as many words as u want, type \"end\" to finish");
        while (true){
            if (sc.hasNext("end")) break;
            words.add(sc.next());
        }
        System.out.println(words.size());
    }
}
