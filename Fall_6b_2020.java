package com.JavaQuestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fall_6b_2020 {
    public static void main(String[] args) {
        try{
            String url ="jdbc:mysql://localhost:3306/form";
            String user ="root";
            String password="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            String sql = "INSERT INTO employees(id,name,post,salary) VAlUES(?,?,?,?)";
            PreparedStatement preparedStatement =connection.prepareStatement(sql);
            preparedStatement.setInt(1,03);
            preparedStatement.setString(2,"Rudra");
            preparedStatement.setString(3,"Ceo");
            preparedStatement.setFloat(4,250000);
            int result =preparedStatement.executeUpdate();
            if(result>0){
                System.out.println("Data is inserted......");
            }else{
                System.out.println("Data is not inserted......");
            }

        }catch(Exception e){
            System.err.println("Error:"+e.getMessage());
        }
    }
}
