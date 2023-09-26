package com.harsh;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        boolean isTrue = true;
        while (isTrue){
            System.out.print("Enter a num: ");
            int n = in.nextInt();
            if(n != 0){
                count++;
                sum += n;
            }else {
                int average = sum/count;
                System.out.println("The average of numbers is " + average);
                isTrue = false;
            }
        }
    }
}
