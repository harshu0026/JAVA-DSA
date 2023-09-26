package com.exercise;

public class RotateCount {
    public static void main(String[] args) {
        int[] arr = {11,13,15,17};
        int ans = rotateCount(arr);
        System.out.println(ans);

    }
    static int rotateCount(int[] arr){
//        int start = 0;
//        int count = 0;
        int pivot = findPivot(arr);
//        while (start <= pivot) {
//            if (arr[pivot] >= arr[0]) {
//                count++;
//                pivot--;
//            }
//        }
        return pivot+1;
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
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
