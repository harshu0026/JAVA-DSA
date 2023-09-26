package com.exercise;

public class OddValue {
    public static void main(String[] args) {
        int[][]  indices = {
            {0,1},
            {1,1}
        };
        int m = 2;
        int n = 3;
        int ans = oddCells(m, n, indices);
        System.out.println(ans);
    }
    static int oddCells(int m, int n, int[][] indices) {
        int[] r = new int[m];
        int[] c = new int[n];

        for (int i = 0 ; i < indices.length; i++) {
            r[indices[i][0]]++;
            c[indices[i][1]]++;
        }

        //Count odd rows
        int oddRows = 0;
        for(int i =0; i < m; i++) {
            if(r[i]%2 == 1) {
                oddRows++;
            }
        }

        //count odd columns
        int oddColumns = 0;
        for(int i =0; i < n; i++){
            if(c[i]%2 == 1) {
                oddColumns++;
            }
        }

        //return Final value
        return oddRows * n + oddColumns * m - 2*oddRows*oddColumns;
    }
    }

