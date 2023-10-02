package com.Exercise;

public class LongPressed {
    public static void main(String[] args) {
        String name = "harsh";
        String typed = "haarsshh";
        System.out.println(isLongPressedName(name, typed));
    }
    static boolean isLongPressedName(String name, String typed) {
        int m = name.length();
        int n = typed.length();
        if(name.charAt(0) != typed.charAt(0)){
            return false;
        }
        if(m > n){
            return false;
        }
        int i=0,j=0;
        while(i<m && j<n){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if(i>0 && name.charAt(i-1)==typed.charAt(j)){
                j++;
            }
            else
                return false;
        }
        if(i<m){
            return false;
        }
        while(j<n) {
            if(name.charAt(i-1)!=typed.charAt(j))
                return false;
            j++;
        }
        return true;
    }
}
