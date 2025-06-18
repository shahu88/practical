package com.napster.javabasics.samara.collectionExample;

import java.io.Serializable;
import java.util.concurrent.CompletableFuture;

public class CF {
    public static void main(String[] args) {
        int array []={ 3,8,2,5,7,6,12};
        int window = 4;
        int Result = maxSum(array, window);


    }

    private static int maxSum(int[] array, int window) {
        int current =0;
        for (int i=0;i<window;i++)
        {
            current = current + array[i];

        }
        int max = current;
        int n= array.length;
        for (int i=1;i<=n-window;i++){
            current = current - array[i-1] + array[i+window-1];
            if (current > max) {
                max = current;
                System.out.println("Maximum sum of subarray of size " + window + " is: " + max);
            }
        }
        return max;
    }
}
