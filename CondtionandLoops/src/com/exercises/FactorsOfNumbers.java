package com.exercises;

import java.util.Scanner;

public class FactorsOfNumbers {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int a = in.nextInt();
        int i = 1;
        while (i <= a){
            if(a%i==0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
