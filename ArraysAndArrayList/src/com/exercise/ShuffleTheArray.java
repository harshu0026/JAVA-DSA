package com.exercise;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] newArr = shuffle(nums, n);
        System.out.println(Arrays.toString(newArr));
    }
    static int[] shuffle(int[] nums, int n) {
        int count = 0;
        int countLess = 0;
        int[] arr = new int[nums.length];
        for (int i = 0;  i<nums.length; i++){
            if (i%2==0){
                arr[i] = nums[i-countLess];
                countLess++;
            }else {
                arr[i] = nums[n+count];
                count++;
            }
        }
        return arr;
    }
}
