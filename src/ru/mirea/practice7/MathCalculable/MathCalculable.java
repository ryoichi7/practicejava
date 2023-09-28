package ru.mirea.practice7.MathCalculable;

interface MathCalculable {
    public double PI = 3.14;

    public double power(int val, int deg);

    public double absolute(double real, double fake);
}

class MathFunc implements MathCalculable {
    public double power(int val, int deg) {
        return Math.pow(val, deg);
    }

    public double absolute(double real, double fake) {
        return Math.sqrt(real * real + fake * fake);
    }

    public static void main(String[] args) {
        MathFunc math = new MathFunc();
        int r = 13;
        double length;
        System.out.println(math.power(5, 3));
        length = 2 * math.PI * r;
        System.out.println(length);
    }
}