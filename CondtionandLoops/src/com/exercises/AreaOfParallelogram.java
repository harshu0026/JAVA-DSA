package com.exercises;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of parallelogram: ");
        float base = in.nextFloat();
        System.out.print("Enter the height of parallelogram: ");
        float height = in.nextFloat();
        float area = base * height;
        System.out.println("Area of parallelogram is " + area);
    }
}
