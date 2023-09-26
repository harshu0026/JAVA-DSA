package com.Exercise;

public class StringAlike {
    public static void main(String[] args) {
        String s = "Book";
        boolean ans = halvesAreAlike(s);
        System.out.println(ans);
    }
    static boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i<s.length(); i++){
            if (i <= s.length()/2-1){
               char a = s.charAt(i);
               boolean ans1 = isVowel(a);
               if (ans1){
                   count1++;
               }
            }else {
               char b = s.charAt(i);
               boolean ans2 = isVowel(b);
               if (ans2){
                   count2++;
               }
            }
        }
        if (count1 == count2){
            return true;
        }
        return false;
    }
    static boolean isVowel(char v){
        char[] arr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char c : arr) {
            if (v == c) {
                return true;
            }
        }
        return false;
    }
}
