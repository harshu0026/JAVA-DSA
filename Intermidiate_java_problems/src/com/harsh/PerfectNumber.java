package com.harsh;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = in.nextInt();
        perfectNumber(n);
    }
    static void perfectNumber(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n%i==0){
                sum +=i;
            }
        }
        if (sum == n){
            System.out.println("isPerfect");
        }else {
            System.out.println("notPerfect");
        }
    }
}
