package com.sameer.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {2,45,2,5,4,2,5,6,5,5,7,5};
        int target = 4;
        System.out.println(linearSearchRange(arr, target, 2, 6));
    }


    // search in the array between a range: return the index if item is found:
    // otherwise return -1
    static int linearSearchRange(int [] arr, int target, int start, int end){
        // if array is empty return -1
        if (arr.length == 0){
            return -1;
        }

        // run loop
        for (int i=start; i< end; i++){
            // check for target at every index
            if (arr[i] == target){
                return i;
            }
        }

        // if no item is found then return -1
        return -1;
    }

}
