package com.B2DArray;

public class FindNegativeNum {
    public static void main(String[] args) {
       int[][] grid = {
               {4,3,2,-1},
               {3,2,1,-1},
               {1,1,-1,-2},
               {-1,-1,-2,-3}
       };
       int ans = countNegatives(grid);
        System.out.println(ans);
    }
    static int countNegatives(int[][] grid) {
        int count = 0;
        int n = grid.length;
        int row = 0;
        int col = grid[0].length - 1;
        while (row < n && col >= 0) {
            if (grid[row][col] < 0) {
                count += (n- row);
                col--;
            } else {
                row++;
            }
        }
        return count;
    }
}
