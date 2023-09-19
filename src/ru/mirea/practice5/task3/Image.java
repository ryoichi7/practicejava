package ru.mirea.practice5.task3;

import java.awt.*;
import javax.swing.*;

class Image extends JFrame {
    int windowWidth = 600;
    int windowHeight = 600;
    String imagePath = "N/A";

    Image(String imagePath) {
        this.imagePath = imagePath;
        setSize(windowWidth, windowHeight);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        java.awt.Image img = Toolkit.getDefaultToolkit().getImage(this.imagePath);
        g.drawImage(img, 0, 0, windowWidth, windowHeight, this);
    }

    public static void main(String[] args) {
        Image image = new Image(args[0]);
    }
}