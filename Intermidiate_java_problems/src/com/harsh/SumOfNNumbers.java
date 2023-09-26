package com.harsh;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Of How many numbers sum you want? ");
        int n = in.nextInt();
        int ans = sumOfNNumbers(n);
        System.out.println("Sum of these "+n+" numbers is " + ans+ "!");
    }
    static int sumOfNNumbers(int n){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int i =1; i<=n; i++){
            System.out.print("Enter " + i + " number: ");
            int newNum = in.nextInt();
            sum += newNum;
        }
        return sum;
    }
}
