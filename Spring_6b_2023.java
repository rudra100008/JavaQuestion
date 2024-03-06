package com.JavaQuestion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Spring_6b_2023 extends JFrame {
    Spring_6b_2023(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));
        JLabel userLabel= new JLabel("User: ");
        JLabel passwordLabel = new JLabel("Password:");

        JTextField user = new JTextField();
        JPasswordField password = new JPasswordField();

        JButton submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultSet resultSet =databaseConnection();
                try{
                    while (resultSet.next()){
                        String userName_db =resultSet.getString(1);
                        String password_db = resultSet.getString(2);
                        String userEnter = user.getText();
                        String userPassword = new String(password.getPassword());
                        if (userName_db.equals(userEnter) && password_db.equals(userPassword)){
                            JOptionPane.showMessageDialog(null,"Login Success");
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Invalid Login");
                }catch (Exception exception){
                    System.out.println(exception.getMessage());
                }

            }
        });

      panel.add(userLabel);panel.add(user);
      panel.add(passwordLabel); panel.add(password);
      panel.add(submit);
      add(panel);
    }
    public ResultSet databaseConnection(){
        ResultSet result= null;
        try {
            String url ="jdbc:mysql://localhost:3306/form";
            String user ="root";
            String password ="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            String sql ="SELECT * FROM login";
            result =statement.executeQuery(sql);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    public static void main(String[] args) {
      Spring_6b_2023 spring = new Spring_6b_2023();
      spring.setTitle("Login Application");
      spring.setLayout(new FlowLayout(FlowLayout.CENTER));
      spring.setSize(800,800);
      spring.setDefaultCloseOperation(EXIT_ON_CLOSE);
      spring.setVisible(true);
    }
}
