package com.exercises;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTrue = true;
        int sum = 0;
        while (isTrue){
            System.out.print("Enter a num: ");
            int a = in.nextInt();
            if(a != 0){
                sum += a;
            }else {
                System.out.println("Here is sum of all given num " + sum);
                isTrue = false;
            }
        }
    }
}
