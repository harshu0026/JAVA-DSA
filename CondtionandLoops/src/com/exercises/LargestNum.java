package com.exercises;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTrue = true;
        int next = 0;
        while (isTrue){
            System.out.print("Enter a num: ");
            int a = in.nextInt();
            if(a != 0){
                if(a > next){
                    next = a;
                }else {
                    next += 0;
                }
            }else {
                System.out.println("Here is largest num from given nums " + next);
                isTrue = false;
            }
        }
    }
}
