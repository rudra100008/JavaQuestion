package com.JavaQuestion;

import java.io.*;

public class Spring_2b_2021 {
    public static void main(String[] args) {
        String fileName ="D:\\Java_Exam.jsp";
        try{
            FileOutputStream fo =new FileOutputStream(fileName);
            BufferedOutputStream bo = new BufferedOutputStream(fo);
            String string ="Bytes of Data";
            byte[] b= string.getBytes();
            bo.write(b);
            bo.flush();
            bo.close();
            System.out.println("Success.....");
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        try{
            BufferedInputStream bi = new BufferedInputStream(new FileInputStream(fileName));
             int a =0;
             while((a=bi.read())!=-1){
                 System.out.print((char)a);
             }
             bi.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
