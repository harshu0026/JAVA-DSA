package com.exercise;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1},
                {1,0}
        };
        int[][] ans = flipAndInvertImage(arr);
        for (int[] an : ans) {
            System.out.println(Arrays.toString(an));
        }

    }
    static int[][] flipAndInvertImage(int[][] image) {
//        int[] arr = new int[image.length];
//        for (int[] ints : image) {
//            for (int j = 0; j < ints.length; j++) {
//                arr[j] = ints[j];
//                if (arr[j] == 1) {
//                    arr[j] = 0;
//                } else {
//                    arr[j] = 1;
//                }
//            }
//            reversed(arr);
//            for (int j = 0; j < ints.length; j++) {
//                ints[j] = arr[j];
//            }
//        }
//        return image;
//    }
//    static void reversed(int[] arr){
//        int start = 0;
//        int end = arr.length-1;
//
//        while (start < end){
//            swap(arr, start, end);
//            start++;
//            end--;
//        }
//    }
//    static void swap(int[] arr, int index1, int index2){
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
        int[] arr = new int[image.length];
        for (int[] ints : image) {
            for (int j = 0; j < ints.length; j++) {
                arr[j] = ints[j];
                if (arr[j] == 1) {
                    arr[j] = 0;
                } else {
                    arr[j] = 1;
                }
            }
            int start = 0;
            int end = arr.length-1;

            while (start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            for (int j = 0; j < ints.length; j++) {
                ints[j] = arr[j];
            }
        }
        return image;
    }
}
