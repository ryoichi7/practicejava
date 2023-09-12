package ru.mirea.practice3.format.tasks1and2;

public class converter {
    public static double USDtoRUB(double usd){
        return usd * 93.96;
    }

    public static double EURtoRUB(double eur){
        return eur * 100.81;
    }
    public static double RUBtoUSD(double rub){
        return rub / 93.96;
    }

    public static double EURtoUSD(double eur){
        return eur * 1.07;
    }

    public static double RUBtoEUR(double rub){
        return rub / 100.81;
    }

    public static double USDtoEUR(double usd){
        return usd / 1.07;
    }
}
