package com.Recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,9,45};
        int target = 8;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target){
        return binary(arr, target, 0, arr.length-1);
    }
    static int binary(int[] arr, int target, int s, int e){
        if (s > e){
            return -1;
        }
        int mid = s + (e - s) /2;
        if (arr[mid] == target){
            return mid;
        } else if (arr[mid] > target) {
            return binary(arr, target, s, mid-1);
        }
        return binary(arr, target, mid+1, e);
    }
}
