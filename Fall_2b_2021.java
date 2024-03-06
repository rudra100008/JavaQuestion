package com.JavaQuestion;

public class Fall_2b_2021 {

    public  void parentMethod() {
        System.out.println("bhuju");
    }
    }

    class Testing extends Fall_2b_2021 {
        @Override
         public  void parentMethod() {
            System.out.println("Ashum");
        }

        public static void main(String[] args) {
            Testing testing = new Testing();
            testing.parentMethod();
        }

    }
