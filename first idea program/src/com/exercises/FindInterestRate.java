package com.exercises;

import java.util.Scanner;

public class FindInterestRate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Principle amount: $");
        int principleAmount = in.nextInt();
        System.out.print("What is the interest rate: ");
        int interestRate = in.nextInt();
        System.out.print("For how many years you want to check: ");
        int durationOfPayment = in.nextInt();
        int payableAmount = (principleAmount * interestRate * durationOfPayment) /100;
        System.out.println("So here you payable amount which is $" + payableAmount + " for the " + durationOfPayment + " Years!");
    }
}
