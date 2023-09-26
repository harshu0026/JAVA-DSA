package com.exercises;

import java.util.Scanner;

public class ParameterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of parallelogram: ");
        int base = in.nextInt();
        System.out.print("Enter the height of parallelogram: ");
        int height = in.nextInt();
        int parameter = 2 * (base + height);
        System.out.println("Parameter of parallelogram is " + parameter);
    }
}
