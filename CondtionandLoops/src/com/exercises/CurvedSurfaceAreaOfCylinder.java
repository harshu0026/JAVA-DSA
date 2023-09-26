package com.exercises;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        float pi = 3.14159f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base radius of cylinder: ");
        float radius = in.nextFloat();
        System.out.print("Enter the height of cylinder: ");
        float height = in.nextFloat();
        double csaOfCylinder = 2 * pi * radius * height;
        System.out.println("CSA of cylinder is " + csaOfCylinder);
    }
}
