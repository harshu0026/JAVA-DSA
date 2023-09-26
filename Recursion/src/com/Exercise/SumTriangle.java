package com.Exercise;

public class SumTriangle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sumTriangle(arr));
    }
    static int sumTriangle(int[] arr){
        if (arr.length-1 < 1){
            return arr[0];
        }
        int[] nums = new int[arr.length-1];
        for (int i = 0; i <= arr.length-2; i++) {
            nums[i] = arr[i] + arr[i+1];
        }
        return sumTriangle(nums);
    }
}
