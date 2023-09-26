package com.exercise;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,3,1};
        int target = 4;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){
       int peak = peakIndexInMountainArray(arr);
       int firstTry = BinarySearch(arr, target, 0, peak);
       if (firstTry != -1){
           return firstTry;
       }
       return BinarySearch(arr, target, peak+1, arr.length-1);
    }
    static  int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int BinarySearch(int[] arr, int target, int start, int end){

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
        return  -1;
    }
}
