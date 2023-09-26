package com.exercise;

import java.util.Arrays;

public class TransposeArray {
    public static void main(String[] args) {
        int[][] arr  = {
                {1,2,3},
                {4,5,6},

        };
        int[][] ans = transpose(arr);
        for (int[] an : ans) {
            System.out.println(Arrays.toString(an));
        }

    }
    static int[][] transpose(int[][] matrix) {
        int[][] list = new int[matrix[0].length][matrix.length];
        for (int i = 0; i<matrix[0].length; i++){
            for (int j = 0; j< matrix.length; j++){
                list[i][j] = matrix[j][i];
            }
        }
        return list;
    }
}
