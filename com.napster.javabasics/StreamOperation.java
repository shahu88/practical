package com.napster.javabasics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperation {

    private static <T> void getStream(List<T> list){
        //Create a stream from the list
        Stream<T> stream = list.stream();

        //Iterate list first to last element
        Iterator<T> iterator = list.iterator();

        //Iterate stream object
        while(iterator.hasNext()){
        System.out.println(iterator.next()+" ");

        }
    }

    private static void getIntegerStream(){

        //Create a stream of integers
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Displaying sequential ordered stream
        stream.forEach(p ->System.out.println(p+" " ));

    }
    private static <T> void getArrayStrean(T[] arr){
        //Create a stream from an array using Array.stream()

        Stream <T> streamOfArray = Arrays.stream(arr);

        Iterator<T> iterator = streamOfArray.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }

    }
    public static void main (String args[]){

        //Create a list of strings
        List <String> list = new ArrayList<>();

        //Add elements to the list
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C#");
        list.add("Ruby");

        //Get stream from the list
        //getStream(list);

        //Get stream of integers
        //getIntegerStream();

        //Get the Array
        String[] arr = new String[]{"Java", "Python", "C++", "C#", "Ruby"};

        //Get stream from the array
        getArrayStrean(arr);




    }
}
