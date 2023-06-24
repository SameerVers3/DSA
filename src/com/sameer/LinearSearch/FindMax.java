package com.sameer.LinearSearch;

public class FindMax {
    public static void main(String[] args) {
        int [] arr = {5,7,23,5,2,8,4,-7,31,83,-4};
        System.out.println(max(arr));
    }


    // assume array length != 0
    static int max(int [] arr){
        // set maximum to first index
        int max = arr[0];
        // loop through whole array
        for (int i=0; i<arr.length; i++){
            // if array[i] is greater than the maximum then new maximum is arr[i]
            if (arr[i] > max){
                max = arr[i];
            }
        }
        // return the maximum number found
        return max;
    }
}
