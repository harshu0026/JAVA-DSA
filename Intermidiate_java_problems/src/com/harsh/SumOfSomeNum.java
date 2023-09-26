package com.harsh;

import java.util.Scanner;

public class SumOfSomeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = in.nextInt();
        sumOfSomeNum(n);

    }
    static void sumOfSomeNum(int n){
        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter " +n+ " numbers: ");
        for (int i = 1; i<=n; i++){

            int num = in.nextInt();
            if (num < 0){
                negativeSum += num;
            }
            if (num%2==0 && num>0){
                positiveEvenSum += num;
            }
            if (num%2!=0 && num>0){
                positiveOddSum += num;
            }
            if (num == 0){
                System.out.println(negativeSum);
                System.out.println(positiveEvenSum);
                System.out.println(positiveOddSum);
            }
        }
    }
}
