package com.harsh;

import java.util.Scanner;

public class HCFOfTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two Num: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        hcfOfTwoNum(num1, num2);

    }
    static void hcfOfTwoNum(int num1, int num2){
        int hcf = 1;
        for(int i=1; i<=num1 && i<=num2; i++){
            if (num1 %i == 0 && num2%i == 0){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
