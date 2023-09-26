package com.exercises;

import java.util.Scanner;

public class ParameterOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of square: ");
        int sideLength = in.nextInt();
        int parameter = 4 * sideLength;
        System.out.println("Parameter of Square is " + parameter);
    }
}
