package com.Exercise;

public class MergeString {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
    }
    static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        if (word2.length() > word1.length()){
            for (int i =0; i<word2.length(); i++){
                if (i < word1.length()){
                    merged.append(word1.charAt(i));
                    merged.append(word2.charAt(i));
                }else {
                    merged.append(word2.charAt(i));
                }
            }
        }else {
            for (int i =0; i<word1.length(); i++){
                if (i < word2.length()){
                    merged.append(word1.charAt(i));
                    merged.append(word2.charAt(i));
                }else {
                    merged.append(word1.charAt(i));
                }
            }
        }
        return merged.toString();
    }
}
