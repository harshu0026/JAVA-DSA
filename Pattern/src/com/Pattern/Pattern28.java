package com.Pattern;

public class Pattern28 {
    public static void main(String[] args) {
      pattern28(5);
    }
    static void pattern28(int n){
        for (int row = 1; row <= (2*n)-1; row++) {
            int totalCol = row <= n ? row : 2*n-row;
            int totalSpace = n - totalCol;
            for (int s = 1; s <= totalSpace; s++) {
                System.out.print(" ");
            }
            for (int col1 = 1; col1 <= totalCol ; col1++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
