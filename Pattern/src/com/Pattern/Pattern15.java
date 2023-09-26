package com.Pattern;

public class Pattern15 {
    public static void main(String[] args) {
        pattern15(8);
    }
    static void pattern15(int n){
        for (int row = 1; row <= (2*n)-1; row++) {
            int totalCol = row <= n ? row : 2*n-row;
            int totalSpace = n - totalCol;
            for (int s = 1; s <= totalSpace; s++) {
                System.out.print(" ");
            }
            for (int col1 = 1; col1 <= totalCol ; col1++) {
                if (col1 == 1 || col1 == row || col1 == 2*n-row){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
