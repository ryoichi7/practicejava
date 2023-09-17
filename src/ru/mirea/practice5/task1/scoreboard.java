package ru.mirea.practice5.task1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class scoreboard implements ActionListener {
    JButton MILAN = new JButton("AC Milan");
    JButton MADRID = new JButton("Real Madrid");
    JLabel resultLabel = new JLabel("Result: 0 vs 0 ", JLabel.CENTER);

    JLabel lastScorerLabel = new JLabel("Last Scorer: N/A", JLabel.CENTER);
    JLabel winnerLabel = new JLabel("Winner: DRAW", JLabel.CENTER);

    int MilanScore = 0;
    int MadridScore = 0;
    scoreboard(){
        JFrame frame = new JFrame("My Second second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MILAN.addActionListener(this);
        MADRID.addActionListener(this);

        MILAN.setBounds(20, 50, 120, 20);
        MADRID.setBounds(150, 50, 120, 20);
        resultLabel.setBounds(80, 100, 120, 20);
        lastScorerLabel.setBounds(80, 120, 120, 20);
        winnerLabel.setBounds(80, 140, 120, 20);


        frame.add(MILAN);
        frame.add(MADRID);
        frame.add(resultLabel);
        frame.add(winnerLabel);
        frame.add(lastScorerLabel);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        if (event.getSource() == MILAN){
            MilanScore++;
            lastScorerLabel.setText("Last Scorer: MILAN");
        }

        if (event.getSource() == MADRID){
            MadridScore++;
            lastScorerLabel.setText("Last Scorer: MADRID");
        }
        resultLabel.setText("Result: " + MilanScore + " vs " + MadridScore);
        if (MilanScore > MadridScore){
            winnerLabel.setText("Winner: MILAN");
        }
        else if (MilanScore < MadridScore){
            winnerLabel.setText("Winner: MADRID");
        }
        else{
            winnerLabel.setText("Winner: DRAW");
        }
    }
    public static void main(String[] args) {
        new scoreboard();
    }
}
