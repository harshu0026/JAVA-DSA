package com.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] newArr = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            arr.add(index[i], nums[i]);
        }
        for (int i = 0; i<arr.size(); i++){
            newArr[i] = arr.get(i);
        }
        return newArr;
    }
}
