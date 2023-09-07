package com.sameer.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = {34,5,3,7,3,7,232,77,36,8,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int [] arr) {
        int minIndex, maxIndex;
        for (int i=0, k=arr.length-1; i< arr.length - 1; i++, k--){
            minIndex = i;
            maxIndex = k;
            for(int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                if (arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
