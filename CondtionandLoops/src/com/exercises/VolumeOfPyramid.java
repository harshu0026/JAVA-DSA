package com.exercises;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of pyramid: ");
        int length = in.nextInt();
        System.out.print("Enter the width of pyramid: ");
        int width = in.nextInt();
        System.out.print("Enter the height of pyramid: ");
        int height = in.nextInt();
        int volume = (length * width * height)/3;
        System.out.println("Volume of pyramid is " + volume);
    }
}
