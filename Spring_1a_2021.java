package com.JavaQuestion;
//Write a  Java program to get 10 array elements from user and put even and
// odd elements in separate array.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Spring_1a_2021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int[] array = new int[10];
            int[] oddArray = new int[array.length];
            int[] evenArray = new int[array.length];
            int evenIndex =0;
            int oddIndex =0;
            System.out.println("Enter the ten integer:");
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
                int number = array[i];
                if (number % 2 == 0) {
                        evenArray[evenIndex] = array[i];
                        evenIndex++;
                }else{
                    oddArray[oddIndex]=array[i];
                    oddIndex++;
                }
            }
            evenArray =Arrays.copyOf(evenArray,evenIndex);
            oddArray =Arrays.copyOf(oddArray,oddIndex);

            System.out.println("Even array:" + Arrays.toString(evenArray));
            System.out.println(Arrays.toString(oddArray));
        }catch(Exception e){
            System.err.println("Error:"+e.getMessage());
        }
    }
}
