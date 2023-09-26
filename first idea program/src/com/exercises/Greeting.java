package com.exercises;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = in.next();
        System.out.println("Hello, " + name + " Good Morning!");
    }
}
