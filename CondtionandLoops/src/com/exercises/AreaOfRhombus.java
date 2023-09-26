package com.exercises;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first diagonal of rhombus: ");
        float d1 = in.nextFloat();
        System.out.print("Enter the second diagonal of rhombus: ");
        float d2 = in.nextFloat();
        float area = (d1*d2)/2;
        System.out.println("Area of rhombus is " + area);
    }
}
