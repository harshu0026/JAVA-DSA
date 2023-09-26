package com.harsh;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the product price: ");
        int price = in.nextInt();
        System.out.print("Enter the commission: $ ");
        int commission = in.nextInt();
        int commissionPercentage = (commission * 100)/ price;
        System.out.println("The commission percentage on this product is " +commissionPercentage + "%");
    }
}
