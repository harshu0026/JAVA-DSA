package com.Exercise;

public class CheckIfStringEqual {
    public static void main(String[] args) {
     String[] word1 = {"ab", "c"};
     String[] word2 = {"a", "bc"};
     boolean ans = arrayStringsAreEqual(word1, word2);
        System.out.println(ans);
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sum1 = new StringBuilder();
        StringBuilder sum2 = new StringBuilder();
        for (String value : word1) {
            sum1.append(value);
        }
        for (String s : word2) {
            sum2.append(s);
        }
        return sum1.toString().contentEquals(sum2);
    }
}
