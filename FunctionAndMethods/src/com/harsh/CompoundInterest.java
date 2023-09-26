package com.harsh;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principle amount: $");
        int principleAmount = in.nextInt();
        double ans = compoundInterest(principleAmount);
        System.out.println("Your Compound Interest is $" + ans );
    }
    static double compoundInterest(int p){
        Scanner in = new Scanner(System.in);
        int compoundFrequency = 0;
        int annual, semiannual, quarterly, monthly;
        annual = 1;
        semiannual = 2;
        quarterly = 4;
        monthly = 12;
        System.out.print("What is Interest rate: " + "%");
        float interest = in.nextInt();
        interest /= 100;
        System.out.print("For how many years you have invested the money: ");
        int year  = in.nextInt();
        System.out.print("What is type of your compound Interest, For(annual(a), semiannual(s), quarterly(q), monthly(m): ");
        char compoundInterestType = in.next().trim().charAt(0);
        switch (compoundInterestType) {
            case 'a' -> compoundFrequency = annual;
            case 's' -> compoundFrequency = semiannual;
            case 'q' -> compoundFrequency = quarterly;
            case 'm' -> compoundFrequency = monthly;
            default -> System.out.println("Please Enter correct type!");
        }
        return p * Math.pow((1 + ((double) interest /compoundFrequency)), (compoundFrequency * year)) - p;
    }
}
