package com.exercises;

import java.util.Scanner;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int a = in.nextInt();
        int sum = 0;
        int product = 1;
        while (a > 0) {
            int rem = a%10;
            sum += rem;
            product *= rem;
            a = a/10;
        }
        int difference = product - sum;
        System.out.println("Sum of the digits is " + sum);
        System.out.println("Product of the digits is " + product);
        System.out.println("Difference between both of them is " + difference);

    }
}
