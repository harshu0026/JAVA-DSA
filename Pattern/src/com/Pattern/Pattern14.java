package com.Pattern;

public class Pattern14 {
    public static void main(String[] args) {
        pattern14(5);
    }
    static void pattern14(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < row-1; space++) {
                System.out.print("  ");
            }
            int i = 2 * (n - row) + 1;
            for (int col = 1; col <= i; col++) {
                if (row == 1){
                    System.out.print("* ");
                }else {
                    if (col == 1 || col == i){
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
