package ru.mirea.practice4._1.task10;

abstract class transport {
    protected double time;
    protected double price;

    public transport(){
        this.time = 0;
        this.price = 0;
    }

    abstract double travel();
}


class Automobile extends transport{
    public Automobile(double time, double price){
        this.time = 10;
        this.price = 20;
    }

    public double travel(){
        return this.time * this.price;
    }
}


class Plane extends transport{
    public Plane(double time, double price){
        this.time = 1;
        this.price = 100;
    }

    public double travel(){
        return this.time * this.price;
    }
}

class Ship extends transport{
    public Ship(double time, double price){
        this.time = 5;
        this.price = 40;
    }

    public double travel(){
        return this.time * this.price;
    }
}

class Train extends transport{
    public Train(double time, double price){
        this.time = 20;
        this.price = 10;
    }

    public double travel(){
        return this.time * this.price;
    }
}

