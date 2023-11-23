package ru.mirea.practice29;

import java.util.*;

public class OrderManager {
    private final Map<String, InternetOrder> map;
    public OrderManager() {
        this.map = new HashMap<>();
    }

    public void addOrder(String address, InternetOrder order){
        if (map.containsKey(address))
            throw new OrderAlreadyExistsException("Specified address already has connected order");
        map.put(address, order);
    }

    public List<item> getOrder(String address){
        InternetOrder order = map.get(address);
        if (order == null) return null;
        return order.toList();
    }

    public void removeOrder(String address){
        map.remove(address);
    }

    public List<List<item>> getOrders(){
        List<List<item>> orders = new ArrayList<>();
        map.values().forEach(internetOrder -> orders.add(internetOrder.toList()));
        return orders;
    }

    public int getOverallPrice(){
        int result = 0;
        for (InternetOrder value : map.values())
            result += value.getOverallPrice();
        return result;
    }

    public int getItemOverallCount(String name){
        int result = 0;
        for (InternetOrder value : map.values()) {
            result += value.getSizeByName(name);
        }
        return result;
    }

    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        try {
            manager.addOrder("Address1",
                    new InternetOrder(Collections.singletonList(
                            new Drink(123, "Cola", "300ml cola can"))));
            manager.addOrder("Address2",
                    new InternetOrder(Collections.singletonList(
                            new Dish(123, "Meatballs with spaghetti", "Very tasty"))));
            System.out.println(manager.getOrder("Address1"));
            System.out.println(manager.getOrders());
            manager.addOrder("Address3",
                    new InternetOrder(Collections.singletonList(
                            new Drink(123, "", "300ml cola can"))));
        } catch (OrderAlreadyExistsException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
