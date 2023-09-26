package com.harsh;

import java.util.Scanner;

public class LCMOfTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two Num: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        lcmOfTwoNum(num1, num2);

    }
    static void lcmOfTwoNum(int num1, int num2){
        int hcf = 1;
        for(int i=1; i<=num1 && i<=num2; i++){
            if (num1 %i == 0 && num2%i == 0){
                hcf = i;
            }
        }
        int lcm = (num1 * num2) / hcf;
        System.out.println(lcm);
    }
}
