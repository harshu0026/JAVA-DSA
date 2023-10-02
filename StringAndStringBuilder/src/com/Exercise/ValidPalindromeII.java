package com.Exercise;

public class ValidPalindromeII {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }
    static boolean validPalindrome(String s) {
        return util1(s);
    }
    static boolean util1(String str) {
        int i = 0, j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return func(str, i + 1, j) || func(str, i, j - 1);
            }
        }
        return true;
    }

    static boolean func(String str, int i, int j) {
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
