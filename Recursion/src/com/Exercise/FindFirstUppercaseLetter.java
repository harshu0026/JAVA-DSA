package com.Exercise;

public class FindFirstUppercaseLetter {
    public static void main(String[] args) {
        String str = "";
        char ans = findUpper(str, 0);
        if (ans == '0'){
            System.out.println("There is no UpperCase letter in String!");
        }else {
            System.out.println(ans);
        }
    }
    static char findUpper(String str, int s){
       if (s > str.length()-1){
           return '0';
       }
       if(Character.isUpperCase(str.charAt(s))){
           return str.charAt(s);
       }
       return findUpper(str, s+1);
    }
}
