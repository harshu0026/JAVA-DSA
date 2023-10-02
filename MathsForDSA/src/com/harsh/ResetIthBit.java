package com.harsh;

public class ResetIthBit {
    public static void main(String[] args) {
        int n = 30;
        int i = 3;
        System.out.println(resetBit(n, i));
    }
    static int resetBit(int n, int i){
         return n & (~(1<< (i-1)));
    }
}
