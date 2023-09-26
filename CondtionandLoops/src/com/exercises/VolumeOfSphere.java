package com.exercises;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        float pi = 3.14159f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of cylinder: ");
        int radius = in.nextInt();
        double volume = (4 * pi * Math.pow(radius, 3))/3;
        System.out.println("Volume of sphere is " + volume);
    }
}
