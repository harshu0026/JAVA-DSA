package com.exercise;


public class IsPangram {
    public static void main(String[] args) {
        String str = "leetcode";
        boolean ans = checkIfPangram(str);
        System.out.println(ans);
    }
    static boolean checkIfPangram(String sentence) {
        int[] a=new int[26];
        char[] ch=sentence.toCharArray();
        for(char p:ch){
            a[p-'a']=1;
        }
        for(int v:a){
            if(v==0){
                return false;
            }
        }
        return true;
    }
}
