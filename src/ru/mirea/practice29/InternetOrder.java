package ru.mirea.practice29;

import java.util.ArrayList;
import java.util.List;

public class InternetOrder implements Order{

    private final Node head;
    private int size;
    public InternetOrder(){
        this.head = new Node();
    }
    public InternetOrder(List<item> items){
        this.size = items.size();
        this.head = new Node();
        Node tmp = head;
        for (item item : items){
            tmp.setNext(new Node(item, head, tmp));
            tmp = tmp.getNext();
        }
        head.setPrev(tmp);
    }

    public boolean addItem(item item){
        if (item == null) return false;

        Node tmp = this.head;

        while(tmp.getNext() != this.head){
            tmp = tmp.getNext();
        }

        tmp.setNext(new Node(item, this.head, tmp));
        size += 1;

        return true;
    }

    @Override
    public boolean removeByName(String name) {
        Node tmp = this.head;

        while(tmp.getNext() != head){
            tmp = tmp.getNext();
            if (tmp.data.getName().equals(name)){
                tmp.getPrev().setNext(tmp.getNext());
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAllByName(String name) {
        int count = 0;
        while (removeByName(name)){
            count += 1;
        }
        return count;
    }

    @Override
    public int getSizeByName(String name) {
        int size = 0;
        while (getItemByName(name) != null){
            size += 1;
        }
        return size;
    }

    public item getItemByName(String name){
        Node tmp = this.head;

        while(tmp.getNext() != head){
            tmp = tmp.getNext();
            if (tmp.data.getName().equals(name)){
                return tmp.data;
            }
        }
        return null;
    }

    private static class Node{
        private item data;
        private Node next;
        private Node prev;

        private Node(item data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        private Node(){
        }
        public item getData() {
            return data;
        }

        public void setData(item data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public List<item> toList() {
        List<item> items = new ArrayList<>();
        Node tmp = this.head;

        while(tmp.getNext() != head){
            tmp = tmp.getNext();
            items.add(tmp.data);
        }
        return items;
    }

    @Override
    public List<item> toListByName(String name) {
        List<item> items = new ArrayList<>();
        Node tmp = this.head;

        while(tmp.getNext() != head){
            tmp = tmp.getNext();
            if (tmp.data.getName().equals(name)){
                items.add(tmp.data);
            }
        }
        return items;
    }

    @Override
    public int getOverallPrice() {
        int price = 0;
        Node tmp = this.head;

        while(tmp.getNext() != head){
            tmp = tmp.getNext();
            price += tmp.data.getPrice();
        }
        return price;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
