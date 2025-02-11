package com.napster.javabasics;

import java.util.Arrays;
import java.util.List;

public class MultipleOfFive {
    public static void main(String[] args){

        List<Integer> numbersList = Arrays.asList(31, 23, 67, 64, 45, 56, 67, 78, 39, 10);
        numbersList.stream().filter(num ->num%5==0).forEach(System.out::println);


    }
}
