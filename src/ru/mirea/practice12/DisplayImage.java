package ru.mirea.practice12;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DisplayImage {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Image path not found, make sure to specify it as CL argument");
            return;
        }

        String imagePath = args[0];
        JFrame frame = new JFrame("DisplayImage");

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            ImageIcon imageIcon = new ImageIcon(image);
            JLabel label = new JLabel(imageIcon);

            frame.getContentPane().add(label, BorderLayout.CENTER);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        } catch (IOException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }
}