package com.JavaQuestion;

import javax.swing.*;
import java.awt.*;

public class Spring_3b_2019 extends JFrame {
    Spring_3b_2019() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JButton north = new JButton("North");
        JButton west = new JButton("West");
        JButton center = new JButton("Center");
        JButton east = new JButton("East");
        JButton south = new JButton("South");

        Dimension dimension = new Dimension(Short.MAX_VALUE,Short.MAX_VALUE);
        north.setMaximumSize(dimension);
        west.setMaximumSize(dimension);
        center.setMaximumSize(dimension);
        east.setMaximumSize(dimension);
        south.setMaximumSize(dimension);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.add(west);
        buttonPanel.add(center);
        buttonPanel.add(east);

        mainPanel.add(north, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(south, BorderLayout.SOUTH);

        add(mainPanel);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Spring_3b_2019();
    }
}
