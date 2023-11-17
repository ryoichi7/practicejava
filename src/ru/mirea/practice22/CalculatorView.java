package ru.mirea.practice22;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {
    JTextArea textArea = new JTextArea();
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");
    JButton buttonDiv = new JButton("/");
    JButton buttonMulti = new JButton("*");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    public JButton buttonIs = new JButton("=");
    JButton buttonPoint = new JButton(".");

    private int height = 20;
    private int width = 65;

    public CalculatorView(){
        super("Simple calculator");
        setBounds(400,400,320,220);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(textArea);
        textArea.setPreferredSize(new Dimension(300,60));
        add(button7);
        button7.setPreferredSize(new Dimension(width,height));
        add(button8);
        button8.setPreferredSize(new Dimension(width,height));
        add(button9);
        button9.setPreferredSize(new Dimension(width,height));
        add(buttonDiv);
        buttonDiv.setPreferredSize(new Dimension(width,height));
        add(button4);
        button4.setPreferredSize(new Dimension(width,height));
        add(button5);
        button5.setPreferredSize(new Dimension(width,height));
        add(button6);
        button6.setPreferredSize(new Dimension(width,height));
        add(buttonMulti);
        buttonMulti.setPreferredSize(new Dimension(width,height));
        add(button1);
        button1.setPreferredSize(new Dimension(width,height));
        add(button2);
        button2.setPreferredSize(new Dimension(width,height));
        add(button3);
        button3.setPreferredSize(new Dimension(width,height));
        add(buttonMinus);
        buttonMinus.setPreferredSize(new Dimension(width,height));
        add(button0);
        button0.setPreferredSize(new Dimension(width,height));
        add(buttonPoint);
        buttonPoint.setPreferredSize(new Dimension(width,height));
        add(buttonIs);
        buttonIs.setPreferredSize(new Dimension(width,height));
        add(buttonPlus);
        buttonPlus.setPreferredSize(new Dimension(width,height));
        button0.addActionListener(e -> textArea.append("0"));
        button1.addActionListener(e -> textArea.append("1"));
        button2.addActionListener(e -> textArea.append("2"));
        button3.addActionListener(e -> textArea.append("3"));
        button4.addActionListener(e -> textArea.append("4"));
        button5.addActionListener(e -> textArea.append("5"));
        button6.addActionListener(e -> textArea.append("6"));
        button7.addActionListener(e -> textArea.append("7"));
        button8.addActionListener(e -> textArea.append("8"));
        button9.addActionListener(e -> textArea.append("9"));
        buttonPoint.addActionListener(e -> textArea.append("."));
        buttonDiv.addActionListener(e -> textArea.append("/"));
        buttonMulti.addActionListener(e -> textArea.append("*"));
        buttonMinus.addActionListener(e -> textArea.append("-"));
        buttonPlus.addActionListener(e -> textArea.append("+"));
    }
}

