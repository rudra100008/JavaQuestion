package com.JavaQuestion;
//Serializable is the mechanism of writing the state of object in thr byte-stream.
//It is done by  method writeObject() ofObjectOutputStream  class and Serializable Interface.
//Deserialization is the mechanism of writing byte-stream in the state of object.
//It is done by method readObject() of  ObjectInputStream class.

import java.io.*;

class Student implements Serializable {
    private  final int id;
    private  final String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


public class SerializableDeserializable {
    public static void main(String[] args) {
        try{
            Student s1 = new Student(01,"Ashum");
            FileOutputStream output = new FileOutputStream("D:\\Number.txt");
            ObjectOutputStream object = new ObjectOutputStream(output);
            object.writeObject(s1);
            object.flush();
            object.close();
            System.out.println("Sucess");

            //Deserializable
            FileInputStream input = new FileInputStream("D:\\Number.txt");
            ObjectInputStream oi = new ObjectInputStream(input);
            Student deserializedStudent = (Student) oi.readObject(); // Deserializing and assigning to a variable
            oi.close();
            System.out.println("Deserialization Success: " + deserializedStudent);
        }catch(Exception e){
            System.err.println("Error: "+e.getMessage());
        }

    }

}
