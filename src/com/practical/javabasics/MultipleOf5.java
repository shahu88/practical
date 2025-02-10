package com.practical.javabasics;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class MultipleOf5 {

    public static void main(String[] args) {
       List<Integer> listOfIntergers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     listOfIntergers.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
    }
}
