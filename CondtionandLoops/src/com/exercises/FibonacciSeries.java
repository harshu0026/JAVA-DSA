package com.exercises;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        for( int i=0; i<num-1; i++){
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
