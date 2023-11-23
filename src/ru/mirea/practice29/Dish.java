package ru.mirea.practice29;

public final class Dish implements item{
    private final int price;
    private final String name;
    private final String info;

    public Dish(int price, String name, String info) {
        if (price < 0 || name.isEmpty() || info.isEmpty()) throw new IllegalArgumentException("Your order has a mistake");
        this.price = price;
        this.name = name;
        this.info = info;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
