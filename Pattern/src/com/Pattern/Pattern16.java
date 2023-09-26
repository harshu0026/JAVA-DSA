package com.Pattern;

public class Pattern16 {
    public static void main(String[] args) {
      pattern16(5);
    }
    static void pattern16(int n){
        for (int row = 1; row <=n ; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
               if (row == n && col == (row/2)+1){
                   System.out.print(row+1 + " ");
               }else {
                   if (col == 1 || col == row){
                       System.out.print(1 + " ");
                   }else {
                       System.out.print(row-1+ " ");
                   }
               }
            }
            System.out.println();
        }
    }
}
