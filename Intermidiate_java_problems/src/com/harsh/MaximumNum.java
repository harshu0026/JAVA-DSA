package com.harsh;

import java.util.Scanner;

public class MaximumNum {
    public static void main(String[] args) {

    }
    static int theMaximumAchievableX(int num, int t) {
        Scanner in = new Scanner(System.in);
        System.out.print("x: ");
        int x = in.nextInt();
        for (int i = 1 ; i<=t; i++){
            x += 1;
            num -= 1;
        }
        return num;
    }
}
