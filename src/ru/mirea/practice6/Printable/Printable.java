package ru.mirea.practice6.Printable;

interface Printable {
    void print();
}

class book implements Printable{
    @Override
    public void print(){
        System.out.println("Book has been printed successfully");
    }
}

class magazine implements Printable{

    @Override
    public void print() {
        System.out.println("Magazine has been printed successfully");
    }
}

class test{
    public static void main(String[] args){
        Printable[] arr = {new book(), new magazine(), new magazine()};
        for (Printable i : arr) i.print();
    }
}