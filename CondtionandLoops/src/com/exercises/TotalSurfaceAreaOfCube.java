package com.exercises;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of cube: ");
        float sideLength = in.nextFloat();
        double tsaOfCube = (6 * Math.pow(sideLength, 2));
        System.out.println("TSA of Cube is " + tsaOfCube);
    }
}
