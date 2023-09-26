package com.exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String sent = "thequickbrownfoxjumpsoverthelazydog";
//        String[] element = sent.split("");
//        ArrayList<String> list = new ArrayList<>(Arrays.asList(element));
//        System.out.println(list);
        for (char ch = 'a'; ch <= 'z'; ch++){
            if (sent.contains(String.valueOf(ch))){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
