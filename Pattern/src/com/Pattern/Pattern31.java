package com.Pattern;

public class Pattern31 {
    public static void main(String[] args) {
        pattern31(4);
    }
    static void  pattern31(int n){
        int n1 = n *2;
        for (int row = 1; row < n1; row++) {
            for (int col = 1; col < n1 ; col++) {
                int atEvery = Math.min(Math.min(row, col), Math.min(n1-row, n1-col));
                System.out.print((n - atEvery + 1) + " ");
            }
            System.out.println();
        }
    }
}
