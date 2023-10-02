package com.Cyclic;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIntersection {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] newArr = new int[list.size()];
        int index = 0;
        for (int li: list){
          newArr[index++] = li;
        }
        return newArr;
    }

    static void sort(int[] arr){
        for (int i = 0; i<arr.length; i++){
            for (int j = 1; j<arr.length-i; j++){
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
