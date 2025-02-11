package com.napster.javabasics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseOrderOfDecimals {
    public static void main(String args[]){
        List<Double> decimalList = Arrays.asList(23.45, 45.67, 56.78, 67.89, 78.90, 89.01, 90.12, 12.34, 34.56, 45.67);
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);



    }
}
