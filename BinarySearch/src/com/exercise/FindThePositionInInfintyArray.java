package com.exercise;

public class FindThePositionInInfintyArray {
    public static void main(String[] args) {
        int[] arr = {2,5,6,9,11,12,13,14,18,22,23,25,31,45,46,50,51,55,58,59,61,63,64,67,68,71,72,73,76};
        int target = 22;
        int ans = ans(arr, target);
        System.out.println(ans);
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return BinarySearch(arr, target, start, end);
    }
    static int BinarySearch(int[] arr, int target, int start, int end){

        while ( start <= end){
            int mid = start + (end - start) /2;
                if (arr[mid] < target){
                    start = mid + 1;
                }else if(arr[mid] > target){
                    end = mid -1;
                }else {
                    return mid;
                }
        }
        return  -1;
    }
}
