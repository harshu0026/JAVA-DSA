package com.B2DArray;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 11;
        int[] ans = search(matrix, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix[row].length-1;
        while (row < matrix.length && col >= 0){
            if (matrix[row][col] == target){
                return new int[] {row, col};
            } else if (matrix[row][col] < target) {
                row++;
            }else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}

//{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}