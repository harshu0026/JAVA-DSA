package com.exercise;

import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] newArr = new int[nums.length];
        for (int i = 0; i<nums.length; i++){
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }
                newArr[i] = count;
            }
            count = 0;

        }
        return newArr;
    }
}
