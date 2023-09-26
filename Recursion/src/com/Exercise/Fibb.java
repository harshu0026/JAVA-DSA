package com.Exercise;

public class Fibb {
    public static void main(String[] args) {
        System.out.println(fib(50));
    }
    static int fib(int n){
        int next = 0;
        int fir = 0;
        int sec = 1;
        for (int i = 1; i < n; i++) {
            next = fir + sec;
            fir = sec;
            sec = next;
        }
        return next;
    }
}
