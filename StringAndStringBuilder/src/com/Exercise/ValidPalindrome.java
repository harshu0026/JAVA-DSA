package com.Exercise;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "H,a rah";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        String newStr = "";
        StringBuilder newSB = new StringBuilder();
        char[] ch = s.toCharArray();
        for (char c: ch){
            if (c >= 48 && c<58 || c>=65 && c<91 || c>= 97 && c<123){
                newStr += c;
                newSB.append(c);
            }
        }
        newStr = newStr.toLowerCase();
        newSB = new StringBuilder(newSB.toString().toLowerCase());
        return newSB.reverse().toString().equals(newStr);
    }
}
