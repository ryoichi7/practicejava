package ru.mirea.practice2.task9;

import java.util.Scanner;
import java.util.ArrayList;
public class poker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] suits = {"spades", "clubs", "hearts", "diamonds"};
        String[] cards = {"6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        ArrayList<String> existingCards = new ArrayList<>(36);
        System.out.println("Enter the amount of players");
        int n = sc.nextInt();
        for (int i = 1; i < n * 5 + 1; ++i){
            int suit = (int)(Math.random() * 4);
            int card = (int)(Math.random() * 9);
            String curCard = cards[card] + " of " + suits[suit];
            if (!existingCards.contains(curCard)){
                existingCards.add(curCard);
                System.out.print(curCard + " || ");
            }
            else if (existingCards.size() != 36){
                while (existingCards.contains(curCard)){
                    suit = (int)(Math.random() * 4);
                    card = (int)(Math.random() * 9);
                    curCard = cards[card] + " of " + suits[suit];
                }
                existingCards.add(curCard);
                System.out.print(curCard + " || ");
            }
            else {
                System.out.printf("No cards left! Sorry, PLAYER %d", i / 5 + 1);
                break;
            }
            if (i % 5 == 0) System.out.printf(" <-- PLAYER %d\n", i / 5);
        }

    }
}
