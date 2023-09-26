package com.harsh;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, sumNegative = 0, sumEvenPositive = 0, sumOddPositive = 0;

        System.out.println("Enter a list of numbers. Enter 0 to terminate.");

        do {
            num = scanner.nextInt();

            if (num < 0) {
                sumNegative += num;
            } else if (num > 0) {
                if (num % 2 == 0) {
                    sumEvenPositive += num;
                } else {
                    sumOddPositive += num;
                }
            }
        } while (num != 0);

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumEvenPositive);
        System.out.println("Sum of positive odd numbers: " + sumOddPositive);

    }
}
