package com.Exercise;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String ans = sortSentence(s);
        System.out.println(ans);
    }
    static String sortSentence(String s) {
        String[] arr =  s.split(" ");
        String[] res = new String[arr.length];
        for (String value : arr) {
            int k = value.length() - 1;
            int m = value.charAt(k) - '0';
            res[m - 1] = value.substring(0, k);
        }
        StringBuilder sb = new StringBuilder();
        for (String ch : res) {
            sb.append(ch).append(" ");
        }
        return (sb.toString());
    }
}
