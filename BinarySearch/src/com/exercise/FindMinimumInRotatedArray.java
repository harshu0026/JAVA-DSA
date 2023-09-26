package com.exercise;

public class FindMinimumInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int ans = findMin(arr);
        System.out.println(ans);
    }
    static int findMin(int[] nums) {
        int pivot = findPivot(nums);
        return nums[pivot +1];
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            } else if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }else if (arr[start] >= arr[mid]){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
