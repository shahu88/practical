package com.napster.javabasics;

 class SumOfIndices {
    public static void main (String args[]){
        int[] arr = {2, 7, 11, 15};
        int target = 0;

        sumOfIndices(arr, target);


        }

     private static int[] sumOfIndices(int[] arr, int target) {
         int[] indices = {0,0};
         for (int i = 0; i < arr.length; i++) {

             for (int j = i + 1; j < arr.length; j++) {
                 //target = target+ (arr[i] + arr[j]); // Example target, can be set to any value

                    if (target == (arr[i] + arr[j])) {
                        indices[0] = i;
                        indices[1] = j;
                        
                    }
                 System.out.println("Sum of indices: " + target + " Indices found: " + indices[0] + ", " + indices[1] + "");
             }
         }
         return indices;
     }


 }

