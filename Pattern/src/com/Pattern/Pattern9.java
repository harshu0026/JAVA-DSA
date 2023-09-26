package com.Pattern;

public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }
    static void pattern9(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < row-1; space++) {
                System.out.print("  ");
            }
            int i = 2 * (n - row) + 1;
            for (int col = 0; col < i; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
