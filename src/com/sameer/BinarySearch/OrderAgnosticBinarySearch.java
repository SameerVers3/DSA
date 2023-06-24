package com.sameer.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
        int target = 3;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] <  arr[end];

        while (start <= end){
            int mid = start + (end-start)/2;

            // arr middle is greater than target then search left
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] > target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else {
                if (arr[mid] < target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

            if (arr[mid] > target){
                end = mid - 1;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
