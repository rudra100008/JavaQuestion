package com.JavaQuestion;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Spring_3b_2019 extends JFrame {
    Spring_3b_2019(){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.X_AXIS));

        Button north = new Button("North");
        Button south = new Button("South");
        Button west = new Button("West");
        Button east = new Button("East");
        Button center = new Button("Center");




        panel.add(north);
        panel1.add(west);
        panel1.add(center);
        panel1.add(east);


        setLayout(new BorderLayout());

        add(south,BorderLayout.SOUTH);
        add(panel,BorderLayout.NORTH);
        add(panel1,BorderLayout.CENTER);


        setSize(500, 500); // Setting frame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exiting application on close
        setVisible(true); // Making frame visible

}

    public static void main(String[] args) {
    new Spring_3b_2019();


    }

}
