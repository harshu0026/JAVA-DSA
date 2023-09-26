package com.exercises;

import java.util.Scanner;

public class IsArmStrong {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a num: ");
            int number = in.nextInt();
            String numberString = Integer.toString(number);
            int length = numberString.length();
            int result = 0;

            for (int i = 0; i < length; i++) {
                char digitChar = numberString.charAt(i);
                int digit = Character.getNumericValue(digitChar);
                double power = Math.pow(digit, length);
                result += power;
            }
            if(result == number){
                System.out.println(number + " is a ArmStrong number.");
            }else{
                System.out.println(number + " is not a ArmStrong number.");
            }
        }
      }
