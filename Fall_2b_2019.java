package com.JavaQuestion;

import java.io.FileWriter;

public class Fall_2b_2019 {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("D:\\abc.txt");
            String string = new String("Test on File Handling");
            fileWriter.write(string);
            fileWriter.flush();
            fileWriter.close();

        }catch (Exception e){
            System.err.println("ERROR:"+e.getMessage());
        }
    }
}
