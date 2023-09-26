package com.Cyclic;

public class FirstPositiveMissing {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] -1;
            if (nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }
        for(int index = 0; index<nums.length; index++){
            if(nums[index] != index + 1){
                return index+1;
            }
        }
        return nums.length+1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
