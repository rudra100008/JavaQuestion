package com.JavaQuestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fall_2019_6b {
    public static void main(String[] args) {
        try {
            String url ="jdbc:mysql://localhost:3306/form";
            String user="root";
            String password="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            String sql ="SELECT * FROM employees WHERE id=03";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet =preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println("Name: "+resultSet.getString(2)+
                        "\nID: "+resultSet.getInt(1)+
                        "\nPost: "+resultSet.getString(3)+
                        "\nSalary: "+resultSet.getFloat(4));
            }

        }catch(Exception e){
            System.err.println("ERROR:"+e.getMessage());
        }
    }
}
