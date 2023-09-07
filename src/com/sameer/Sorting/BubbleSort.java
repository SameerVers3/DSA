package com.sameer.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {34,5,3,7,3,7,232,77,36,8,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){

        boolean swapped; // boolean value as a flag
        // outer loop runs n-1 times
        for (int i=0; i< arr.length; i++) {
            // inner loop runs ( n - 1 - i ) time
            // for each inner loop the maximum item comes at the last index
            swapped = false;
            for (int j=0; j< arr.length - 1 - i; j++){
                if (arr[j] > arr[j+1]){
                     // swap if the item is smaller than previous item
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    // boolean swap true
                    swapped = true;
                }
            }

            // if No swap for a particular i then break the loop
            if (!swapped){ // !swap is true
                break;
            }
        }
    }
}
