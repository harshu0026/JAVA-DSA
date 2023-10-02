package com.Exercise;

public class Fibb {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(fibb(i));
//        }
        System.out.println(fibb(5055));
    }

    static long fibb(int n){
        return (long) ((Math.pow(((1+ Math.sqrt(5))/2), n) - Math.pow(((1 - Math.sqrt(5))/2), n)) / Math.sqrt(5));
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
