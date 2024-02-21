package com.JavaQuestion;// Write a program to generate a Frame with two TextFields and aButton arranged
// in GridLayout.
//when button is clicked change the background color od the frame to green if both TextFiles have
//same content.If the TextField has different content then change the background
// color to the frame to red.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spring_3b_2023 extends JFrame {
    Spring_3b_2023(){
        JPanel panel = new JPanel(new GridLayout(3,0));
        panel.setSize(200,300);
        panel.setVisible(true);
        JTextField text1 = new JTextField();
        JTextField text2 = new JTextField();
        JButton click = new JButton("Click");

        panel.add(text1);
        panel.add(text2);
        panel.add(click);
        add(panel);
        click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word1 = text1.getText();
                String word2  =text2.getText();
                if (word1.equals(word2)){
                    getContentPane().setBackground(Color.GREEN);
                }else {
                    getContentPane().setBackground(Color.RED);
                }
            }
        });
    }

    public static void main(String[] args) {
        Spring_3b_2023 spring = new Spring_3b_2023();
        spring.setLayout(new FlowLayout(FlowLayout.CENTER));
        spring.setSize(800,700);
        spring.setVisible(true);
    }
}
