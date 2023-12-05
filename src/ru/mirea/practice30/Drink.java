package ru.mirea.practice30;

public final class Drink extends MenuItem implements Alcoholable {

    private final DrinkTypeEnum type;

    public Drink(DrinkTypeEnum type){
        this.type = type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return type.isAlcoholicDrink();
    }

    @Override
    public double getAlcoholVol() {
        return type.getAlcoholVol();
    }

    public DrinkTypeEnum getType(){
        return type;
    }
}
