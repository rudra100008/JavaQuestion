package com.JavaQuestion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Spring_4a_2019 extends JFrame {
    Spring_4a_2019(){
        JTextField textField = new JTextField();
        textField.setBounds(150,50,50,30);
        JButton submit = new JButton("Submit ");
        submit.setBounds(150,100,70,20);

        JLabel areaOfCircle = new JLabel("Area of Circle:");
        areaOfCircle.setBounds(150,200,150,50);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    double radius = Double.parseDouble(textField.getText());
                    double area = Math.PI * radius * radius;
                    areaOfCircle.setText("Area of Circle: " + area);
                }catch (NumberFormatException n){
                    JOptionPane.showMessageDialog(null,"Enter valid number");
                }

            }
        });
       add(textField);
       add(submit);
       add(areaOfCircle);

       setTitle("Area of Circle");
       setLayout(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(300,300);
       setVisible(true);
    }

    public static void main(String[] args) {
        new  Spring_4a_2019();
    }
}
