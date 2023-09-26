package com.harsh;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value (x1, y1): ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.print("Enter value of (x2, y2): ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        double distance = ((Math.pow((x2 -x1), 2) + Math.pow((y2 - y1), 2)) * 2)/10;
        System.out.println("So the distance between two points " + distance + " units");
    }
}
