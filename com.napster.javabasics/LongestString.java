package com.napster.javabasics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
public static void main(){
    List<String> strings = Arrays.asList("apple", "banana", "cherry", "date","grapefruit", "kiwi", "mango", "orange", "papaya", "pineapple");
    Optional<String> longestString = strings.stream().max(Comparator.comparingInt(String::length));

    System.out.println("The longest string is: " + longestString);
}
}
