package com.Cyclic;

public class Missing2 {
    public static void main(String[] args) {
        int[] arr = {0,1,3};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }
        for(int index = 0; index<nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
