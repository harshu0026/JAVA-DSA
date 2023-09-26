package com.exercises;

import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        int amountInRupees = in.nextInt();
        int covertIntoDollar = amountInRupees / 82;
        System.out.println("Here is you converted amount which is " + covertIntoDollar);

    }
}
