package com.exercises;

import java.util.Scanner;

public class ParameterOfCircle {
    public static void main(String[] args) {
        float pi = 3.14159f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int radius = in.nextInt();
        double parameter = 2 * pi * radius;
        System.out.println("Parameter of circle is " + parameter);
    }
}
