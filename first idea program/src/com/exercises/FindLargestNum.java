package com.exercises;

import java.util.Scanner;

public class FindLargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first num: ");
        float a = in.nextFloat();
        System.out.print("Enter second num: ");
        float b = in.nextFloat();
        if(a>b){
            System.out.println("Largest number is: " + a);
        }else {
            System.out.println("Largest number is: " + b);
        }
    }
}
