package com.harsh;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = in.nextInt();
        isLeapYear(year);
    }
    static void isLeapYear(int year){
        if (year%4==0){
            if(year%100 != 0){
                System.out.println("isLeapYear!");
            }else {
                if (year%400 == 0){
                    System.out.println("isLeapYear!");
                }else {
                    System.out.println("isNotLeapYear!");
                }
            }
        }else {
            System.out.println("isNotLeapYear!");
        }
    }
}
