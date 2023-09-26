package com.harsh;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How much unit you have used: ");
        int unit = in.nextInt();
        double electricityBill = (6.40 * unit);
        System.out.println("Here is you Electricity Bill " + electricityBill);

    }
}
