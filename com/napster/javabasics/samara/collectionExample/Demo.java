package com.napster.javabasics.samara.collectionExample;

public class Demo {
    Object o = null;
    int i = 0;
    String s = "Hello";
    public static void method1(Object o) {
        System.out.println("Method called with object: " + o);
    }
    public static void method1(int i) {
        System.out.println("Method called with int: " + i);
    }
    public static void method1(String s) {
        System.out.println("Method called with String: " + s);
    }
    public static void main(String args[]){
        Demo demo = new Demo();

         method1 (demo); // Calls the instance method

    }
}
