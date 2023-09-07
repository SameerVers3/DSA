package com.sameer.Sorting;

import java.util.Arrays;

public class InsersionSort {
    public static void main(String[] args) {
        int []arr = {34,5,3,7,3,7,232,77,36,8,9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int [] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++){
            for (int j=i;j>0 ;j--){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }
}
