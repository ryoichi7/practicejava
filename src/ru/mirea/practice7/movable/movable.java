package ru.mirea.practice7.movable;

interface Movable {
    public void moveUp();

    public void moveDown();

    public void moveLeft();

    public void moveRight();

    public boolean SpeedTest();
}

class MovableRectangle implements Movable {
    private double upperX;
    private double upperY;
    private double lowerX;
    private double lowerY;
    private double upperSpeed;
    private double lowerSpeed;

    public MovableRectangle(double upperX, double upperY, double lowerX, double lowerY, double upperSpeed, double lowerSpeed) {
        this.lowerX = lowerX;
        this.lowerY = lowerY;
        this.upperX = upperX;
        this.upperY = upperY;
        this.upperSpeed = upperSpeed;
        this.lowerSpeed = lowerSpeed;
    }

    public void moveUp() {
        this.lowerY += this.lowerSpeed;
        this.upperY += this.upperSpeed;
    }

    public void moveDown() {

        this.lowerY -= this.lowerSpeed;
        this.upperY -= this.upperSpeed;
    }

    public void moveLeft() {
        this.upperX -= this.upperSpeed;
        this.lowerX -= this.lowerSpeed;

    }

    public void moveRight() {
        this.upperX += this.upperSpeed;
        this.lowerX += this.lowerSpeed;
    }

    @Override
    public String toString() {
        return "Upper: " + this.upperX + " " + this.upperY + " " + this.upperSpeed + "\n" + "Lower " + this.lowerX + " " + this.lowerY + " " + this.lowerSpeed;
    }

    public boolean SpeedTest() {
        return this.upperSpeed == this.lowerSpeed;
    }

    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(5, 6, 7, 8, 5, 5);
        System.out.println(rect.SpeedTest());
    }
}