package ru.mirea.practice4._1.task8;

public abstract class Shape {

    public static void main(String[] args){
        Rectangle qwe = new Rectangle(15,26,"blue",true);
        System.out.printf("Area: %.3f Perimeter: %.3f\n",qwe.getArea(), qwe.getPerimeter());
        Circle asd = new Circle(10,"red",false);
        System.out.printf("Area: %.3f Perimeter: %.3f\n", asd.getArea(), asd.getPerimeter());
    }
    Shape(){}
    Shape (String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    protected String color;
    protected boolean filled;

};

class Circle extends Shape {
    Circle(){}
    Circle (double radius){
        this.radius = radius;
    }
    Circle (double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        if (filled){
            return 3.14 * radius * radius;
        }
        return 0;
    }

    @Override
    double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    private double radius;
};

class Rectangle extends Shape {
    Rectangle(){}
    Rectangle (double width, double length){
        this.width = width;
        this.length = length;
    }
    Rectangle (double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    @Override
    double getArea() {
        if (filled){
            return width * length;
        }
        return 0;
    }

    @Override
    double getPerimeter() {
        return (width + length) * 2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    protected double width;
    protected double length;
};
