package com.harsh;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int base = in.nextInt();
        System.out.print("Enter the Exponent: ");
        int exponent = in.nextInt();
        int ans = power(base, exponent);
        System.out.println("Power of " +base +" is " +ans);
    }
    static int power(int a, int b){
        int result = 1;
        for (int i= 0; i<b; i++ ){
            result *= a;
        }
        return result;
    }
}
