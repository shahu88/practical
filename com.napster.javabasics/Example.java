package com.napster.javabasics;

public class Example {

    public static int test(){
        int x = 10;
        try{
            System.out.println("Inside Try Block");
            return x+ 1; // This will return 11, but the finally block will execute afterwards
        }finally {
            System.out.println("Inside Finally Block");
            x=2;
            //return x+2;
        }
    }
    public static void main(String[] args) {

       // test();
        System.out.println("Inside Main Method  "+test());

    }
}
