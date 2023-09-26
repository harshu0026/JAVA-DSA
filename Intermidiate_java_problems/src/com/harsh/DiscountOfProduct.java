package com.harsh;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter the MRP of Product: ");
        int mrp = in.nextInt();
        System.out.print("Enter the price on which have you bought: ");
        int boughtPrice = in.nextInt();
        int difference = mrp - boughtPrice;
        int discount = (difference * 100) / mrp;
        System.out.println("So the discount which you have got on this product is " + discount + "%");

    }
}
