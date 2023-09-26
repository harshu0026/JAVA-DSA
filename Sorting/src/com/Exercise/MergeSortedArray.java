package com.Exercise;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {};
        int m = 1;
        int n = 0;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int start = m;
        int end = n-1;
        while(start< nums1.length && end>=0){
            nums1[start] = nums2[end];
            start++;
            end--;
        }
        boolean swapped;
        for (int i = 0; i < nums1.length; i++) {
            swapped = false;
            for (int j = 1; j < nums1.length-i; j++) {
                if(nums1[j] < nums1[j-1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j-1];
                    nums1[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
