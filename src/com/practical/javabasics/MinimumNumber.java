package com.practical.javabasics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinimumNumber {
    public static void main(String args[]){
        List<Integer> intList = Arrays.asList(12, 45, 78, 23, 56, 89, 34, 67, 90, 11);
        int maxNumber =intList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum Number: "+maxNumber);

    }
}
