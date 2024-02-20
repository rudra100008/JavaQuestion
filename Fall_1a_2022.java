package com.QuestionBank;
//write a java program to get 10 array elements from user and delete xth position
// elements from array.

import java.util.Arrays;
import java.util.Scanner;

public class Fall_1a_2022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 elements in array:");
        int[] number =new int[10];
        int[] number_new= new int[number.length-1];
        for (int i = 0; i < number.length; i++) {
            number[i] = scan.nextInt();
        }
        System.out.println("Enter the position of number to be deleted from array:");
        int position = scan.nextInt();

        for ( int i=0, k=0;i<number.length;i++){
            if (position != i){
                number_new[k] =number[i];
                k++;
            }else System.out.printf("\n Number in position %d is  deleted..\n.",position);

        }
        System.out.println("After Deletion:"+ Arrays.toString(number_new));

//        int[] arr = new int[]{1,2,3,4,5};
//        int[] arr_new = new int[arr.length-1];
//        int j=3;
//        for(int i=0, k=0;i<arr.length;i++){
//            if(i!=j){
//                arr_new[k]=arr[i];
//                k++;
//            }
//        }
//        System.out.println("Before deletion :" + Arrays.toString(arr));
//        System.out.println("After deletion :" + Arrays.toString(arr_new));
    }

}
