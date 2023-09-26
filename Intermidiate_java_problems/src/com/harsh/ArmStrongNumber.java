package com.harsh;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num till you want to print Arm Strong Number: ");
        int n = in.nextInt();
        for (int i =100; i<=n; i++) {
            boolean ans = armStrongNum(i);
            if (ans){
                System.out.print(i + ", ");
            }
        }
    }
    static boolean armStrongNum(int n){
        int sum = 0;
        int original = n;
        while (n>0){
            int rem = n%10;
            sum += (rem*rem*rem);
            n = n/10;
        }
        return sum == original;
    }
}
