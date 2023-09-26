package com.exercise;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] nums1 = {1, 2, 3, 4};
        int[] ans = runningSum(nums);
        int[] ans2 = returnSum(nums1);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));
    }
    static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];

        }
        return nums;
    }
    static int[] returnSum(int[] nums2){
        int sum = 0;
        for (int i =0; i<nums2.length; i++){
            sum += nums2[i];
            nums2[i] = sum;
        }
        return nums2;
    }
}
