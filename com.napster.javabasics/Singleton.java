package com.napster.javabasics;

public class Singleton {
    private static Singleton instance = null;
    private Singleton() {
        System.out.println("Singleton instance created");
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();



    }
}
