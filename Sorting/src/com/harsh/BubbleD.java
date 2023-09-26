package com.harsh;

import java.util.Arrays;

public class BubbleD {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void bubble(int[] nums){
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length-i; j++) {
                if(nums[j] > nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
