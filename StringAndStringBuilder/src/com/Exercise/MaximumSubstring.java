package com.Exercise;

public class MaximumSubstring {
    public static void main(String[] args) {
        String s = "ababc";
        String word = "ab";
        System.out.println(maxRepeating(s, word));

    }
    static int maxRepeating(String sequence, String word) {
        String find="";
        while(sequence.contains(find)) {
            find += word;
        }
        return (find.length()-word.length())/word.length();
    }
}
