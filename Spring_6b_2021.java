package com.JavaQuestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Spring_6b_2021 {
    public static void main(String[] args) {
        try{
            String url ="jdbc:mysql://localhost:3306/db_std";
            String user ="root";
            String password ="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            String sql="INSERT INTO Employee(name)VALUES(?)";
            String sql1= "SELECT COUNT(*) FROM Employee";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            PreparedStatement countStatement =connection.prepareStatement(sql1);
            while(true) {
                System.out.println("Enter the name of the employee:");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.next();

                  preparedStatement.setString(1, name);
                int rowsInsert = preparedStatement.executeUpdate();
                if (rowsInsert > 0) {
                    System.out.println("Data Inserted....");
                }
                ResultSet resultSet=countStatement.executeQuery();
                while(resultSet.next()) {
                    int count =resultSet.getInt(1);
                    System.out.println("Number of Employee: "+ count);
                }
            }

        }catch(Exception e){
            System.err.println("Error: "+ e.getMessage());
        }
    }
}
