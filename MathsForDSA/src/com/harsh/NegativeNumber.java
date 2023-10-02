package com.harsh;

public class NegativeNumber {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(negative(n));
    }
    static int negative(int n){
        return (~n) + 1;
    }
}
