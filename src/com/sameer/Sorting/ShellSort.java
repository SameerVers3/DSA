package com.sameer.Sorting;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int []arr = {1000,34,5,3,7,3,7,232,77,36,8,9};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void shellSort(int [] arr){


        for (int gap = arr.length/2;gap>0; gap = gap == 2? 1: (int)(gap/2.2)){
            for (int i=gap; i<arr.length; i++){
                int temp = arr[i];
                int j=i;
                for (;j >= gap && temp < arr[j-gap];  j -= gap){
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }
}
