package com.napster.javabasics;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeUnsortedArrays {
    public static void main(String args[]){
        int arr1[] = new int[] {23, 45, 56, 67, 78, 89, 90, 12, 34, 45};
        int arr2[] = new int[] {31, 23, 67, 64, 45, 56, 67, 78, 39, 10};

        int result[] = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().toArray();
        System.out.println("Merged and sorted array is: "+Arrays.toString(result));

    }
}
