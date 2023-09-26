package com.exercises;

import java.util.Scanner;

public class IsPalindrom {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a String: ");
            String word = in.nextLine();
            boolean isPalindrome = true;

            int length = word.length();
            for (int i = 0; i < length / 2; i++) {
                if (word.charAt(i) != word.charAt(length - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }
    }
