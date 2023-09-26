package com.harsh;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 23597;
        while (n > 0){
            int rem = n %10;
            n = n/10;
            System.out.print(rem);
        }

    }
}
