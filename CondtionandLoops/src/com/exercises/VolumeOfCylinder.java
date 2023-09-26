package com.exercises;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        float pi = 3.14159f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of cylinder: ");
        int radius = in.nextInt();
        System.out.print("Enter the height of cylinder: ");
        int height = in.nextInt();
        double volume = (pi * Math.pow(radius, 2) * height);
        System.out.println("Volume of cylinder is " + volume);
    }
}
