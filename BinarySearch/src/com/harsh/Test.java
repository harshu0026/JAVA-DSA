package com.harsh;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] newArr = {
                {1,0,0,0},
                {1,1,1,1},
                {1,0,0,0},
                {1,0,0,0}
        };
        int k = 2;
        int[] ans = kWeakestRows(newArr, k);
        System.out.println(Arrays.toString(ans));
    }
    static int[] kWeakestRows(int[][] mat, int k) {
        int[] arr = new int[mat.length];
        int count = 0;
        int[] newArr = new int[k];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            arr[i] = count;
            count = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length -i; j++){
                if(arr[j] <= arr[j-1]){
                    arr[j] = j-1;
                    arr[j-1] = j;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            newArr[i] = arr[i];

        }
        return newArr;
    }
}
