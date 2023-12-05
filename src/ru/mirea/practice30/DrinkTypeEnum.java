package ru.mirea.practice30;

public enum DrinkTypeEnum {
    BEER(true, 3.5), WINE(true, 10.2), VODKA(true, 42.3), BRANDY(true,50.3), CHAMPAGNE(true, 9.3),
    WHISKEY(true, 44.4), TEQUILA(true, 46.7), RUM(true, 55.7), VERMUTH(true, 16.0), LIQUOR(true, 30.1),
    JAGERMEISTER(true, 35.3), JUICE(false, 0), COFFEE(false, 0), GREEN_TEA(false, 0),
    BLACK_TEA(false, 0), MILK(false, 0), WATER(false, 0), SODA(false, 0);

    private double alcoholVol;
    private boolean alcoholicDrink;

    private DrinkTypeEnum(boolean alcoholicDrink, double alcoholVol){
        this.alcoholicDrink = alcoholicDrink;
        this.alcoholVol = alcoholVol;
    }

    public double getAlcoholVol() {
        return alcoholVol;
    }

    public void setAlcoholVol(double alcoholVol) {
        this.alcoholVol = alcoholVol;
    }

    public boolean isAlcoholicDrink() {
        return alcoholicDrink;
    }

    public void setAlcoholicDrink(boolean alcoholicDrink) {
        this.alcoholicDrink = alcoholicDrink;
    }
}
