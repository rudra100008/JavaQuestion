package com.JavaQuestion;

public class Spring_1b_2019 {
    private final int value;
    Spring_1b_2019( int value){
        this.value= value;
    }
      
    public void print(int value){
        System.out.println("Instance variable: "+this.value);
        System.out.println("method variable: "+value);
    }

    public static void main(String[] args) {
Spring_1b_2019 spring = new Spring_1b_2019(10);
spring.print(20);
    }
}
