package com.sameer.LinearSearch;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {34,52,1},
                {5,66,2,6},
                {1,78,5,9 ,5},
                {12,9,8}
        };
        System.out.println(max2(arr));
    }

    // find maximum number in 2D array
    static int max(int [][] arr){
        // set maximum to first index of 2D array {0,0}
        int max = arr[0][0];

        // loop for rows
        for (int i=0; i< arr.length; i++){
            // loop for column in that row
            for (int j=0; j< arr[i].length; j++){
                // if arr[i][j] is greater than max then set new maximum
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        // return the maximum
        return max;
    }

    // using for each loops
    static int max2(int [][] arr){
        // set maximum to first index of 2D array {0,0}
        int max = Integer.MIN_VALUE;
        // loop for rows
        for (int [] ints: arr){
            // loop for column in that row
            for (int element: ints){
                // if arr[i][j] is greater than max then set new maximum
                if (element > max){
                    max = element;
                }
            }
        }
        // return the maximum
        return max;
    }
}
