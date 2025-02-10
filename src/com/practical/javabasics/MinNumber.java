package com.practical.javabasics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinNumber {
    public static void main (String args[])
    {
        List<Integer> intList = Arrays.asList(12, 45, 78, 23, 56, 89, 34, 67, 90, 11);
        int minNumber =intList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Minimum Number: "+minNumber);
    }
}
