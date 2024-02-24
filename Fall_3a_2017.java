package com.JavaQuestion;
//Write a program to store object of a class StudentObject into a file student.dat
// also read the object from sam e file and display the state of the object in the screen.
// Handle the possible exception

import java.io.*;

class StudentObject implements Serializable {
    private  final int rollNo;
    private  final String name;
    private  final String address;
    StudentObject(int rollNo,String name,String address){
        this.rollNo =rollNo;
        this.name=name;
        this.address=address;
    }
    @Override
    public String toString(){
        return ("Rollno: "+ rollNo+
        "\nName: "+name +
    "\nAddress: "+ address);
    }
}

public class Fall_3a_2017 {
    public static void main(String[] args) {
        StudentObject studentObject = new StudentObject(1,"name","address");
        try{
            FileOutputStream fo = new FileOutputStream("D:\\Student.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(studentObject);
            oo.flush();
            oo.close();

        }catch(IOException e){
            System.err.println("ERROR: "+e.getMessage());
        }
        try{
            FileInputStream fi = new FileInputStream("D:\\Student.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            StudentObject studentObject1 =(StudentObject) oi.readObject();
            System.out.println("Student Details:");
            System.out.println(studentObject1);


        }catch(Exception io){
            System.err.println("ERROR: "+io.getMessage());
        }
    }
}
