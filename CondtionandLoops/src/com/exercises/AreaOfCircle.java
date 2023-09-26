package com.exercises;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        float pi = 3.141f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float radius = in.nextFloat();
        double areaOfCircle  = pi * Math.pow(radius, 2);
        System.out.println("Area of circle is " + areaOfCircle);

    }
}
