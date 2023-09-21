package ru.mirea.practice6;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable{
    int x, y, xSpeed, ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "Point: " + this.x + " " + this.y;
    }

    @Override
    public void moveUp(){
        this.y -= this.ySpeed;
    }

    @Override
    public void moveDown(){
        this.y += this.ySpeed;
    }

    @Override
    public void moveLeft(){
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight(){
        this.x += this.xSpeed;
    }
}

class MovableCircle extends MovablePoint implements Movable{
    int radius;

    MovableCircle(int x, int y, int radius, int xSpeed, int ySpeed){
        super(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle: " + this.x + " " + this.y + " " + this.radius;
    }
}