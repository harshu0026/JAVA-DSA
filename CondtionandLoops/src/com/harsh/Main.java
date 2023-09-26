package com.harsh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int n = 1738757978;
//        String stringIn = Integer.toString(n);
//        int length = stringIn.length();
//        int count = 0;
//        for (int i=0; i<length; i++){
//            if (stringIn.charAt(i) == '7'){
//                count += 1;
//            }
//        }
//        System.out.println(count);
        int n = 155253;
        int count = 0;
        while (n > 0){
            int rem = n%10;
            if (rem == 5){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);

    }
}