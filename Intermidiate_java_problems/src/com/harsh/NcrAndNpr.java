package com.harsh;

import java.util.Scanner;

public class NcrAndNpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = in.nextInt();
        System.out.print("Enter how many number num want to combine and permute: ");
        int chooseAndPermuteNum = in.nextInt();
        int ncr = nCr(num, chooseAndPermuteNum);
        int npr = nPr(num, chooseAndPermuteNum);
        System.out.println("nCr of the " +num + " is " +ncr+ "!");
        System.out.println("nPr of the " +num + " is " +npr+ "!");
    }
    static int factorial(int n){
        int factorial = 1;
        for (int i =1; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }
    static int nCr(int n, int r){
        return (factorial(n))/(factorial(r)*factorial(n-r));
    }
    static int nPr(int n, int r){
        return (factorial(n))/(factorial(n-r));
    }
}
