package com.napster.javabasics.samara.collectionExample;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String args[]){
        HashMap<Integer,String> map = new HashMap<>();
        HashMap<Integer,String> map2 = new HashMap<>();

        // Adding elements to the HashMap
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map2.put(1, "Seven");
        map2.put(2, "Eight");
        map2.put(3, "Nine");
        map2.put(4, "Ten");

        // Displaying the HashMap
        System.out.println("HashMap 1: " + map);
        System.out.println("HashMap 2: " + map2);
        // Ordered is not guaranteed in HashMap

    }
}
