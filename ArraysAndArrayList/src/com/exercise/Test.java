package com.exercise;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1},
                {1,0}
        };
        int[][] target = {
                {1,0},
                {0,1}
        };
        boolean ans = findRotation(arr, target);
        System.out.println(ans);
    }
    static boolean findRotation(int[][] mat, int[][] target) {
        if (mat == target)  return true;
        int n = mat.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) { //clockwise 90
            for (int j = 0; j < n; j++) {
                res[i][j] = mat[n - 1 - j][i];
            }
        }

        int[][] res2 = new int[n][n];
        for (int i = 0; i < n; i++) { //clockwise 180
            for (int j = 0; j < n; j++) {
                res2[i][j] = res[n - 1 - j][i];
            }
        }

        int[][] res3 = new int[n][n];
        for (int i = 0; i < n; i++) { //clockwise 270
            for (int j = 0; j < n; j++) {
                res3[i][j] = res2[n - 1 - j][i];
            }
        }

        //compare to 90,180,270 and itself
        if(Arrays.deepEquals(target, res) || Arrays.deepEquals(target, res2) || Arrays.deepEquals(target, res3) || Arrays.deepEquals(target, mat) ){
            return true;
        }
        return false;
    }
}
