package com.exercises;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of triangle: ");
        float base = in.nextFloat();
        System.out.print("Enter the height of triangle: ");
        float height = in.nextFloat();
        float area = (base*height)/2;
        System.out.println("Area of triangle is " + area);
    }
}
