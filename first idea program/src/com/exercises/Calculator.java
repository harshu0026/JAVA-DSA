package com.exercises;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int a = in.nextInt();
        System.out.print("Enter second num: ");
        int b = in.nextInt();
        System.out.print("Enter the operators (+, -, *, /): ");
        char operator = in.next().charAt(0);
        if(operator == '+'){
            int sum = a + b;
            System.out.println(sum);
        } else if (operator == '-') {
            int subtract = a - b;
            System.out.println(subtract);
        } else if (operator == '*') {
            int multiply = a * b;
            System.out.println(multiply);
        } else if (operator == '/') {
            int division = a/b;
            System.out.println(division);

        }
    }
}
