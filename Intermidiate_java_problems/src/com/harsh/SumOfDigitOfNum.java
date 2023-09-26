package com.harsh;

import java.util.Scanner;

public class SumOfDigitOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = in.nextInt();
        sumOfDigits(n);
    }
    static void sumOfDigits(int n){
        int sum = 0;
        while (n > 0){
            int rem = n%10;
            sum += rem;
            n = n/10;
        }
        System.out.println(sum);
    }
}
