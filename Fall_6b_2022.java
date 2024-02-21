// I think we can do this by using SUM for no of students and AVG for marks in the query itself and display it using the ResultSet statement which is easier to do than this. (Its's just my opinion) 



package com.JavaQuestion;
//A Database db_std contains a table tbl_std having field roll,name,faculty and mark.
// Write a program that does achieve the following:
// Print the total number of students
// Find the average marks

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fall_6b_2022 {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/db_std";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String sql ="SELECT * FROM tbl_std";
            ResultSet result = statement.executeQuery(sql);
            float totalMarks=0;
            int count =0;
            while(result.next()){
                if (result.getString(3).equals("CIVIL")) {
                    System.out.println("Civil Faculty\n");
                    System.out.println(
                            "RollNo: " + result.getInt(1) + "\n" +
                                    "Name: " + result.getString(2) + "\n" +
                                    "Faculty: " + result.getString(3) + "\n" +
                                    "Marks: " + result.getFloat(4)+"\n");

                }else{
                    System.out.println("IT Faculty\n");
                    System.out.println(
                            "RollNo: " + result.getInt(1) + "\n" +
                                    "Name: " + result.getString(2) + "\n" +
                                    "Faculty: " + result.getString(3) + "\n" +
                                    "Marks: " + result.getFloat(4)+"\n");
                }
                float marks =result.getFloat(4);
                totalMarks +=marks;
                count++;

            }
            System.out.println("Total Marks: "+totalMarks);
System.out.println("Number of students: "+count);
        }catch(Exception e){
            System.err.println("Error"+e.getMessage());
        }
    }
}
