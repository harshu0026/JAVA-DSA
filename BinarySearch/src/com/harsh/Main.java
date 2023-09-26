package com.harsh;

public class Main {
    public static void main(String[] args) {
        int[] arr = {48,36,20,14,12,11,9,6,4,2};
        int target = 36;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAscending = arr[start] < arr[end];

        while ( start < end){
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
        return  -1;
    }
}