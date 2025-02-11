package com.napster.javabasics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MinimumNumber{
    public static void main(String[]args){

        List<Integer> numbersList = Arrays.asList(31, 23, 67, 64, 45, 56, 67, 78, 39, 10);

       int minNumber = numbersList.stream().min(Comparator.naturalOrder()).get() ;

        System.out.println("Minimum number in the list is: " + minNumber);



    }
}

