package ru.mirea.practice6.temperature;


public class temperature {
    public static void main(String[] args) {
        System.out.println(FahrenheitConverter.convert(0));
        System.out.println(KelvinConverter.convert(0));
    }
}

interface Converter{
    public static double convert(){
        return 0;
    }
}

class KelvinConverter implements Converter{
    public static double convert(double celsius){
        return celsius + 273;
    }
}

class FahrenheitConverter implements Converter{
    public static double convert(double celsius){
        return celsius * (9.0/5.0) + 32;
    }

}

