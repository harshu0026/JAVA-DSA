package com.exercises;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        float pi = 3.14159f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of cone: ");
        int radius= in.nextInt();
        System.out.print("Enter the height of cone: ");
        int height = in.nextInt();
        double volume = (pi * Math.pow(radius, 2) * height)/3;
        System.out.println("volume fo cone is " + volume);
    }
}
