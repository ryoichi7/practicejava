package ru.mirea.practice5.task2;

import java.awt.*;
import javax.swing.*;

class RandomShapes extends JFrame {
    int windowWidth = 600;
    int windowHeight = 600;

    // Init
    RandomShapes() {
        super("shapes");
        setSize(windowWidth, windowHeight);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        for (int i = 0; i < 20; i++) {
            int choice = (int) (Math.random() * 7);

            switch (choice) {

                case 1 -> {
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * windowWidth),
                            (int) (Math.random() * windowHeight),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                }

                case 2 -> {
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect(
                            (int) (Math.random() * windowWidth),
                            (int) (Math.random() * windowHeight),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                }

                case 3 -> {
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawLine(
                            (int) (Math.random() * windowWidth),
                            (int) (Math.random() * windowWidth),
                            (int) (Math.random() * windowHeight),
                            (int) (Math.random() * windowHeight)
                    );
                }

                case 4 -> {
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawArc(
                            (int) (Math.random() * windowWidth),
                            (int) (Math.random() * windowHeight),
                            (int) (Math.random() * windowWidth),
                            (int) (Math.random() * windowHeight),
                            (int) (Math.random() * 360),
                            (int) (Math.random() * 360)
                    );
                }

                case 5 -> {
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRoundRect(
                            (int) (Math.random() * windowWidth),
                            (int) (Math.random() * windowHeight),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                }

                case 6 -> {
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * windowWidth),
                            (int) (Math.random() * windowHeight),
                            100,
                            100
                    );
                }
            }
        }
    }

    public static void main(String[] args) {
        RandomShapes randomShapes = new RandomShapes();
    }
}