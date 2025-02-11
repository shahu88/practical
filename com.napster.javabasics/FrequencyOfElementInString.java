package com.napster.javabasics;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElementInString {
    public static void main(String args[]){
        String inputString = "I am learning Java programming language. Java is a popular programming language";
        Map<Character, Long> frequencyMap = inputString.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Frequency of each character in the string is: "+frequencyMap);
    }
}
