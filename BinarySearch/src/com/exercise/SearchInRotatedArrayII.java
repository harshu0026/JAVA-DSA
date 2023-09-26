package com.exercise;

public class SearchInRotatedArrayII {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 2;
        boolean ans = search(arr, target);
        System.out.println(ans);
    }
    static boolean search(int[] nums, int target){
        int pivot = findPivot(nums);
        if (pivot ==  -1 ){
            return BinarySearch(nums, target, 0, nums.length-1);
        }
        if (nums[pivot] == target){
            return true;
        }
        if (target >= nums[0]){
            return BinarySearch(nums, target, 0,pivot-1);

        }
        return BinarySearch(nums, target, pivot+1, nums.length-1);
    }
    static  int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            } else if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }else if (arr[start] >= arr[mid]){
                end--;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
    static boolean BinarySearch(int[] arr, int target, int start, int end){

        while ( start <= end){
            int mid = start + (end - start) /2;
            if (arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid -1;
            }else {
                return true;
            }
        }
        return  false;
    }
}
