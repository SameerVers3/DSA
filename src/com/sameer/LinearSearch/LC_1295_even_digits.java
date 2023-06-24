package com.sameer.LinearSearch;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class LC_1295_even_digits {
    public static void main(String[] args) {
        int [] arr = {43,233,5344, 55,2,4,23, 954433};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int sum = 0;
        for (int i=0; i<nums.length; i++){
            if (((Integer.toString(nums[i])).length() % 2 ) == 0){
                sum++;
            }
        }
        return sum;
    }
}

