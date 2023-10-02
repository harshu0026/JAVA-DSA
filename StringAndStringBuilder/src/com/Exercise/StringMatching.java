package com.Exercise;

public class StringMatching {
    public static void main(String[] args) {
        String haystack = "harsh";
        String needle = "haarssh";
        System.out.println(strStr(haystack, needle));
    }
    static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
