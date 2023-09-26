package com.exercise;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,15,20,45};
        int target = 1;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target){
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
        return  end;
    }
}
