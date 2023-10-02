package com.harsh;

public class FindIthBit {
    public static void main(String[] args) {
       int n = 12;
        System.out.println(ithBit(n, 3));
    }
    static int ithBit(int n, int i){
        return n & (1 << (i-1));
    }
}
