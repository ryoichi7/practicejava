package ru.mirea.practice4.task1;

public class task1 {
    public static void main(String[] args){
        for (seasons season : seasons.values()){
            System.out.println(season.toString());
            System.out.println(season.getDescription());
            seasons.favouriteSeason(season);
            System.out.println(season.avgTemperature);
        }
    }
}

enum seasons{
    spring(0),
    winter(-10),
    summer(10){
        public String getDescription(){
            return "Warm season";
        }
    },
    autumn(0);

    public int avgTemperature;
    seasons(int avgTemperature){
        this.avgTemperature = avgTemperature;
    }
    public String getDescription(){
        return "Cold season";
    }
    public static void favouriteSeason(seasons season){
        switch(season){
            case winter:
                System.out.println("My favourite season is winter");
                break;
            case autumn:
                System.out.println("My favourite season is autumn");
                break;
            case spring:
                System.out.println("My favourite season is spring");
                break;
            case summer:
                System.out.println("My favourite season is summer");
                break;
        }
    }
}