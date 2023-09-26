package com.Exercise;

public class DecryptString {
    public static void main(String[] args) {
        String s = "10#11#12";
        String ans = freqAlphabets(s);
        System.out.println(ans);
    }
    static String freqAlphabets(String s) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--) {
            int number;
            if(s.charAt(i) == '#') {
                number = (s.charAt(i-2) - '0') * 10 + (s.charAt(i-1) - '0');
                i-=2;
            } else {
                number = s.charAt(i) - '0';
            }
            sb.append(arr[number-1]);
//            sb.append((char) (number +96));
        }

        return sb.reverse().toString();
    }
}
