package com.exercise;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        char[] chr = {'A', 'B', 'C'};
        swap(chr, 0, 1);
        System.out.println(Arrays.toString(chr));
    }
    static void swap(char[] arr, int index1, int index2){
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
