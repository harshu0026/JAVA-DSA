package com.exercises;

import java.util.Scanner;

public class ParameterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        int length = in.nextInt();
        System.out.print("Enter the width of rectangle: ");
        int width = in.nextInt();
        int parameter = (length + width) * 2;
        System.out.println("Parameter of rectangle is " + parameter);
    }
}
