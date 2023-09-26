package com.Exercise;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr = {'a', 'b','c','d'};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(char[] s){
        reverseString(s, 0, s.length-1);
    }
    static  void reverseString(char[] s, int start, int end) {
        if(start >= end){
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverseString(s, start+1, end-1);
    }
}
