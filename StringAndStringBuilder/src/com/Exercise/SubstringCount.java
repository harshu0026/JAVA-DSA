package com.Exercise;

public class SubstringCount {
    public static void main(String[] args) {
        String[] arr = {"a","abc","bc","d"};
        String word = "abc";
        int ans = numOfStrings(arr, word);
        System.out.println(ans);
    }
    static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }
        return count;
    }
}
