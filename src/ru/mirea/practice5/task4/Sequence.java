package ru.mirea.practice5.task4;

import java.awt.*;
import javax.swing.*;
import java.io.File;

class Sequence extends JFrame {
    int windowWidth = 600;
    int windowHeight = 600;
    String imagesPath = "D:/seq";


    Sequence() {
        setSize(windowWidth, windowHeight);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        File dir = new File(this.imagesPath);
        for (File file : dir.listFiles()) {
            Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
            g.drawImage(frame, 0, 0, windowWidth, windowHeight, this);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
    }
}