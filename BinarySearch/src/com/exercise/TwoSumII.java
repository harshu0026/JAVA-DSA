package com.exercise;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int start = 0;
        int end = numbers.length-1;
        int sum;
        while(start < end){
            sum = numbers[start] + numbers[end];
            if(sum == target){
                arr[0] = start+1;
                arr[1] = end+1;
                return arr;
            }else if(sum > target){
                end--;
            }else{
                start++;
            }
        }
        return arr;
    }
}
