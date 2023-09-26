package com.Cyclic;

public class Missing {
    public static void main(String[] args) {
        int[] arr = {0,1,3};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    static int missingNumber(int[] nums) {
        cyclic(nums);
        int i = 0;
        while(i < nums.length){
            if (nums[i] != i){
                return i;
            }else {
                i++;
            }
        }
        return i;
    }
    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            if (arr[i] != arr.length){
                if (arr[i] != arr[correctIndex]){
                    swap(arr, i, correctIndex);
                }else {
                    i++;
                }
            }else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
