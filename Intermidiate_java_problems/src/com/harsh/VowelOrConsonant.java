package com.harsh;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Character: ");
        char chr = in.next().charAt(0);
        isVowelOrConsonant(chr);
    }
    static void isVowelOrConsonant(char chr){
        if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
            System.out.println("So the " +chr+ " is a Vowel!");
        }else {
            System.out.println("So the " +chr+ " is Consonant!");
        }
        }
    }

