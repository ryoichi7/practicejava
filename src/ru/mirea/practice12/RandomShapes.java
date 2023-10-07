package ru.mirea.practice12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape() {
        Random random = new Random();
        this.color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        this.x = random.nextInt(400); // Максимальная ширина окна
        this.y = random.nextInt(400); // Максимальная высота окна
    }

    abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;

    public Circle() {
        super();
        this.radius = new Random().nextInt(50) + 10; // Случайный радиус от 10 до 60
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 2 * radius, 2 * radius);
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
        super();
        this.width = new Random().nextInt(100) + 20; // Случайная ширина от 20 до 120
        this.height = new Random().nextInt(100) + 20; // Случайная высота от 20 до 120
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

public class RandomShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Случайные фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int i = 0; i < 20; i++) {
                    int shapeType = new Random().nextInt(2); // 0 - круг, 1 - прямоугольник
                    Shape shape;
                    if (shapeType == 0) {
                        shape = new Circle();
                    } else {
                        shape = new Rectangle();
                    }
                    shape.draw(g);
                }
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}