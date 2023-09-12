package ru.mirea.practice3.format.tasks1and2;

public class shop {
    private double[] itemspriceList;
    private final int size = (int)(Math.random() * 5);
    private String currency = "RUB";
    shop(){
        itemspriceList = new double[size];
        for (int i = 0; i < size; ++i){
            itemspriceList[i] = (Math.random() * 1000);
        }
    }
    public void showCurrentList(){
        System.out.println("Current available items: ");
        for (int i = 0; i < size; ++i){
            System.out.printf("Item %d/%d; Price: %.2f " + currency + "\n", i + 1, size, itemspriceList[i]);
        }
    }

    public void toUSD(){
        if (currency == "RUB"){
            for (int i = 0; i < size; ++i){
                itemspriceList[i] = converter.RUBtoUSD(itemspriceList[i]);
                currency = "USD";
            }
        }
        else if (currency == "EUR"){
            for (int i = 0; i < size; ++i){
                itemspriceList[i] = converter.EURtoUSD(itemspriceList[i]);
                currency = "USD";
            }
        }
    }

    public void toRUB(){
        if (currency == "USD"){
            for (int i = 0; i < size; ++i){
                itemspriceList[i] = converter.USDtoRUB(itemspriceList[i]);
                currency = "RUB";
            }
        }
        else if (currency == "EUR"){
            for (int i = 0; i < size; ++i){
                itemspriceList[i] = converter.EURtoRUB(itemspriceList[i]);
                currency = "RUB";
            }
        }
    }

    public void toEUR(){
        if (currency == "USD"){
            for (int i = 0; i < size; ++i){
                itemspriceList[i] = converter.USDtoEUR(itemspriceList[i]);
                currency = "EUR";
            }
        }
        else if (currency == "RUB"){
            for (int i = 0; i < size; ++i){
                itemspriceList[i] = converter.RUBtoEUR(itemspriceList[i]);
                currency = "EUR";
            }
        }
    }
}
