package com.Pattern;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        for (int row = 1; row <= (2*n)-1; row++) {
            int totalCol = row <= n ? row : 2*n-row;
                for (int col1 = 1; col1 <= totalCol ; col1++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
