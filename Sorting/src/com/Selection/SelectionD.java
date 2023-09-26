package com.Selection;

import java.util.Arrays;

public class SelectionD {
    public static void main(String[] args) {
        int[] arr = {5,6,4,1,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -i-1;
            int min = findMin(arr, 0, last);
            swap(arr, min, last);
        }
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static int findMin(int[] arr , int start, int end){
        int min = start;
        for (int i = 0; i <= end; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }
}
