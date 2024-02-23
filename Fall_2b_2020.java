package com.JavaQuestion;
//Wap to write bytes of data to a file called "exams.txt" and reading it until end
// of the file is obtained,using proper exception handling

import java.io.*;

public class Fall_2b_2020 {
    public static void main(String[] args) {
        try{//Writing in exams.txt file
            FileOutputStream fo = new FileOutputStream("D:\\exams.txt");
            BufferedOutputStream bo= new BufferedOutputStream(fo);
            String string ="Bytes of Data";
            byte[] bytes= string.getBytes();
            bo.write(bytes);
            bo.flush();
            bo.close();
            System.out.println("Success....");

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        try{//Reading the byte and printing in console
            FileInputStream fi = new FileInputStream("D:\\exams.txt");
            BufferedInputStream bi = new BufferedInputStream(fi);
            int k=0;
            while((k=bi.read())!=-1){
                System.out.print((char)k);
            }
            fi.close();
            bi.close();

        }catch (Exception io){
            System.out.println(io.getMessage());
        }
    }
}
