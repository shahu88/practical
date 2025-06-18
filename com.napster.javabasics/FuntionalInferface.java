package com.napster.javabasics;
@FunctionalInterface
public interface FuntionalInferface {

    void singleAbstractMethod();

    default void defaultMethod() {
        System.out.println("This is a default method in a functional interface.");
    }
    default void anotherDefaultMethod() {
        System.out.println("This is another default method in a functional interface.");
    }
}
