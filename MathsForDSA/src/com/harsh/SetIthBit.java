package com.harsh;

public class SetIthBit {
    public static void main(String[] args) {
        int n = 45;
        int i = 4;
        System.out.println(setBit(n, i));
    }
    static int setBit(int n, int i){
        return n | (1<< (i-1));
    }
}
