package com.harsh;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.nextLine();
        String newString = reverseString(str);
        System.out.println(newString);

    }
    static String reverseString(String str){
        char[] newString = str.toCharArray();
        int start = 0;
        int end = newString.length-1;

        while (start < end){
            swap(newString, start, end);
            start++;
            end--;

        }
        return new String(newString);
    }

    static void swap(char[] newString, int start, int end){
        char temp = newString[start];
        newString[start] = newString[end];
        newString[end] = temp;
    }
}
