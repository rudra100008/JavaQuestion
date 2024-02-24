package com.JavaQuestion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
class Student123 {

    private String name;
    private String address;

    public Student123( String name, String address) {

        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}



public class Fall_3b_2018 {
    public static void main(String[] args) {
        String filename = "D:\\output.txt";

        // Create a list to store student objects
        List<Student123> students = new ArrayList<>();

        // Read the file and populate the list
        try (
                BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String address = parts[1].trim(); // Trim whitespace from the address
                students.add(new Student123(name, address));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Retrieve students with address "Kathmandu"
        List<Student123> studentsInKathmandu = new ArrayList<>();
        for (Student123 student : students) {
            if (student.getAddress().equalsIgnoreCase("Kathmandu")) {
                studentsInKathmandu.add(student);
            }
        }

        // Display the students with address "Kathmandu"
        System.out.println("Students with address 'Kathmandu':");
        for (Student123 student : studentsInKathmandu) {
            System.out.println("Name: " + student.getName() + ", Address: " + student.getAddress());
        }
        }



}


