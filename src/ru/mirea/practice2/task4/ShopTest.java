package ru.mirea.practice2.task4;

import java.util.Scanner;
public class ShopTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        System.out.println("Enter the amount of PC's that are going to be added");
        int len = sc.nextInt();
        for (int i = 0; i < len; ++i){
            String name = sc.next();
            shop.add(name);
        }
        int choice;
        while (true) {
            System.out.println("Press 1 to add a new PC");
            System.out.println("Press 2 to remove PC by it's name");
            System.out.println("Press 3 to find PC's id by its name");
            System.out.println("Press 4 to exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter PC's name");
                    String PcToAdd = sc.next();
                    shop.add(PcToAdd);
                    break;
                case 2:
                    System.out.println("Enter PC's name");
                    String PcToDelete = sc.next();
                    shop.remove(PcToDelete);
                    break;
                case 3:
                    System.out.println("Enter PC's name");
                    String PcToFind = sc.next();
                    shop.FindPc(PcToFind);
                    break;
                case 4:
                    System.out.println("The program has been successfully finished");
                    return;
            }
        }
    }
}
