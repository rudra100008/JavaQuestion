package com.JavaQuestion;

import java.util.Scanner;

public class Fall_2b_2014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.println("Enter a number:");
          int number  =scanner.nextInt();
            System.out.println("The number is "+number);
        }catch (Exception num){
            System.err.println("ERROR: "+num.getMessage());
        }
    }
}
