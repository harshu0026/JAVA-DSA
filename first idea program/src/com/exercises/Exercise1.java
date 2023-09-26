package com.exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        int lcm = (num1 * num2) / gcd;

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}


//System.out.print("Enter a  first num: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter a second num: ");
//        int num2 = in.nextInt();
//        int i= 2;
//        while(i<=num1 && i<=num2) {
//        if (num1 % i == 0 && num2%i==0) {
//        int gcd = i;
//        num1 /= i;
//        } else {
//        i++;
//        }
//        }
