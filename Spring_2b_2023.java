package com.JavaQuestion;
//Write a complete Java program to write  primitive data(roll,name,address)
// to file "Student.txt" through serialization mechanism?

//Serializable is the mechanism of writing the state of object in thr byte-stream.
//It is done by  method writeObject() ofObjectOutputStream  class and Serializable Interface.
//Deserialization is the mechanism of writing byte-stream in the state of object.
//It is done by method readObject() of  ObjectInputStream class.

import java.io.*;

class Student2 implements Serializable {
    private final int rollNo;
    private final String name,address;
    Student2(int rollNo,String name,String address){
        this.rollNo=rollNo;
        this.name =name;
        this.address =address;
    }
    @Override
    public String toString(){
        return ("name= "+name
            +"\nRollNo= "+ rollNo
        +"\nAddress= "+address);
    }
}
public class Spring_2b_2023 {
    public static void main(String[] args) {
        Student2 s1 = new Student2(01,"Ashum","Narayantar");
        Student2 s2 =new Student2(02,"Ram","Boudha");
        try{
            //Serializable
            FileOutputStream fo = new FileOutputStream("D:\\student.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(s1);
            oo.writeObject(s2);
            oo.flush();
            oo.close();
        }catch (IOException io){
            System.err.println("ERROR: "+io.getMessage());
        }
        try{
            //Deserializable
            FileInputStream fi = new FileInputStream("D:\\student.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            Student2 student1 = (Student2) oi.readObject();
            Student2 student2 = (Student2) oi.readObject();
            System.out.println("Deserialization successful. Student details:");
            System.out.println(student1);
            System.out.println(student2);
        }catch(Exception io){
            System.err.println("ERROR: "+io.getMessage());
        }
    }
}
