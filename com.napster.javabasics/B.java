package com.napster.javabasics;

public class B extends A{
 public void method() throws Exception {
     System.out.println("Child class method");
 }
 public static void main(String[] args) throws Exception {

     A a = new B();
     a.method();

 }
}
