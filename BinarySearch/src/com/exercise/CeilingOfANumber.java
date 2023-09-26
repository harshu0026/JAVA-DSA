package com.exercise;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,15,20,36,45};
        int target = 19;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }
    static int Ceiling(int[] arr, int target){
        if (target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        boolean isAscending = arr[start] < arr[end];

        while ( start <= end){
            int mid = start + (end - start) /2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAscending){
                if (arr[mid] < target){
                    start = mid + 1;
                }else {
                    end = mid -1;
                }
            }else {
                if (arr[mid] > target){
                    start = mid + 1;
                }else {
                    end = mid -1;
                }
            }
        }
        return  start;
    }
}
