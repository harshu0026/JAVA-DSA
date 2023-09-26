package com.exercises;

import java.util.Scanner;

public class FibbonacciSeries {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a num: ");
            int n = in.nextInt();

            int first = 0;
            int second = 1;

            System.out.println("Fibonacci series up to " + n + " terms:");
            System.out.print(first + " ");

            for (int i = 1; i < n; i++) {
                System.out.print(second + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }
    }

