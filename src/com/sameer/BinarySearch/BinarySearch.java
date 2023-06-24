package com.sameer.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,4,6,33,56,78,90,110, 123, 300};
        int target = 1001;
        System.out.println(binarySearch(arr, target));
    }

    // return the index and if not found return -1
    static int binarySearch(int [] arr, int target){
        // start index is 0 and ending index is length - 1
        int start = 0;
        int end = arr.length-1;

        // till the start is less than equal to end
        while (start <= end){      

            // why (end - start) because it can exceed integer limit
            // middle = averge of start and end;
            int middle = start + (end-start) / 2;

            // if target is less than middle then search in left side
            if (target < arr[middle]){
                end = middle-1;
            }
            // if target is less than middle then search in right side
            else if (target > arr[middle]){
                start = middle+1;
            }
            // if its equal to target then return the middle (index)
            else{
                return middle;
            }
        }

        // if none of above condition is hit then return -1 means element not found
        return -1;
    }
}
