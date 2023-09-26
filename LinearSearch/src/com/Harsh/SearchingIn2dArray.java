package com.Harsh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchingIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {56,4,5,85,23},
                {12,21,45}
        };
        int target  = 21;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        int ans2 = max(arr);
        System.out.println(ans2);

    }
    static int[] search(int[][] arr,  int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }

            }

        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }

            }

        }
        return max;
    }
}
