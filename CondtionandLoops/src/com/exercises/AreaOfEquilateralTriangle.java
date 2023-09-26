package com.exercises;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        float squareRootOfThree = 1.73205f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of triangle: ");
        int sideLength = in.nextInt();
        double area = (squareRootOfThree * Math.pow(sideLength, 2))/4f;
        System.out.println("Area of Equilateral triangle is " + area);
    }
}
