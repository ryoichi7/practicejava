package ru.mirea.practice29;

import java.util.List;

public interface Order {
    boolean addItem(item item);
    boolean removeByName(String name);
    int removeAllByName(String name);
    int getSizeByName(String name);
    int getSize();
    List<item> toList();
    List<item> toListByName(String name);
    int getOverallPrice();

}
