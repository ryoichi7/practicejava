package ru.mirea.practice12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationExample {
    private JFrame frame;
    private JPanel animationPanel;
    private Timer timer;
    private int currentFrame = 0;
    private int totalFrames = 5; // Общее количество кадров в анимации
    private ImageIcon[] frames;

    public AnimationExample() {
        frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        animationPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (frames != null && currentFrame < frames.length) {
                    frames[currentFrame].paintIcon(this, g, 0, 0);
                }
            }
        };

        frame.add(animationPanel);
        frame.setVisible(true);

        // Загрузка кадров анимации
        frames = new ImageIcon[totalFrames];
        for (int i = 0; i < totalFrames; i++) {
            frames[i] = new ImageIcon("src/ru/mirea/practice12/frames/frame" + i + ".jpg");
        }

        // Создание и запуск таймера для анимации
        int delay = 500; // Задержка между кадрами в миллисекундах
        timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame++;
                if (currentFrame >= totalFrames) {
                    currentFrame = 0;
                }
                animationPanel.repaint();
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AnimationExample();
            }
        });
    }
}