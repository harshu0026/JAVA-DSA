package com.exercises;

import java.util.Scanner;

public class ParameterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of Equilateral Triangle: ");
        int sideLength = in.nextInt();
        double parameter = 3 * sideLength;
        System.out.println("Parameter of Equilateral Triangle is " + parameter);
    }
}
