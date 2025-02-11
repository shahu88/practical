package com.napster.javabasics;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(31, 23, 67, 64, 45, 56, 67, 78, 39, 10);
        int maxNumber = numbersList.stream().max(Integer::compareTo).get();
        System.out.println("Maximum number in the list is: " + maxNumber);

    }
}
