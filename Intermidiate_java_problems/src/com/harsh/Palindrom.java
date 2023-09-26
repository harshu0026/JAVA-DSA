package com.harsh;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = in.nextInt();
        System.out.println(isPalindrom(num));

    }
    static boolean isPalindrom(int num){
        String newNum = String.valueOf(num);
        int length = newNum.length();
        boolean isTrue = true;
        for (int i = 0; i<length /2; i++){
            if (newNum.charAt(i) != newNum.charAt(length-1-i)){
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }
}
