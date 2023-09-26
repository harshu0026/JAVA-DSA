package com.Exercise;


public class SuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};
        String ans = restoreString(s, arr);
        System.out.println(ans);
    }
    static String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        for(int i = 0; i<s.length(); i++){
            arr[indices[i]] = s.charAt(i);
        }
        return new String(arr);
    }
}
