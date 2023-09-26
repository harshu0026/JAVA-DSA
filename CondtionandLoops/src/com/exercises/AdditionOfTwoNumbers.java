package com.exercises;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two Num: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int addition = a + b;
        System.out.println("Addition of " + a + " and " + b + " is " + addition);
    }
}
