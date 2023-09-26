package com.exercise;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int ans = diagonalSum(arr);
        System.out.println(ans);
    }
    static int diagonalSum(int[][] mat) {
        int sum=0;
        int j =0;
        int k = mat.length-1;
        for (int[] ints : mat) {
            sum += ints[j];

            j++;

        }
        for(int i =0 ; i<mat.length ; i++){
            if(i!=k){
                sum+=mat[i][k];
            }
            k--;
        }

        return sum;
    }
}
