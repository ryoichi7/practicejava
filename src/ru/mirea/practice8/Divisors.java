package ru.mirea.practice8;

public class Divisors {

    public static boolean isPrime(int num){
        int div = 2;
        while (div * div <= num){
            if (num % div == 0){
                return false;
            }
            div++;
        }
        return true;
    }
    public static void divisors(int num){
        divisors(num, 2);
    }
    private static void divisors(int num, int div) {

        if (isPrime(num)) {
            System.out.println(num);
            return;
        }
        if (num % div == 0){
            if (isPrime(div)) System.out.print(div + "\t");
            divisors(num/div, div);
        }
        else divisors(num, div + 1);

    }
}
class test{
    public static void main(String[] args) {
        Divisors.divisors(123);
    }
}