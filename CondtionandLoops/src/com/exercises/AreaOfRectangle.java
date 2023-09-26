package com.exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        int length = in.nextInt();
        System.out.print("Enter the width of rectangle: ");
        int width = in.nextInt();
        int area = length * width;
        System.out.println("Area of rectangle is " + area);
    }
}
