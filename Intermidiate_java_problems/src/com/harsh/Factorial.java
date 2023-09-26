package com.harsh;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int n = in.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println("The factorial of " + n + " is " + factorial);
    }
}
