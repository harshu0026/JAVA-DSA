package com.exercises;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of prism: ");
        int base = in.nextInt();
        System.out.print("Enter the height of prism: ");
        int height = in.nextInt();
        int volume = (base * height);
        System.out.println("Volume of prism is " + volume);
    }
}
