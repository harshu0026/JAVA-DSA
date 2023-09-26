package com.Exercise;

public class ReverseStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            arr[i] = "";
            for (int j = word.length()-1; j>=0; j--){
                arr[i] += word.charAt(j);
            }
        }
        return String.join(" ", arr);
    }
}
