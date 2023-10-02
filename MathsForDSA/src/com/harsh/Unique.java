package com.harsh;

public class Unique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,2,4,5,6,4,6};
        System.out.println(isUnique(arr));
    }
    static int isUnique(int[] arr){
        int unique = 0;
        for (int n: arr){
            unique ^= n;
        }

        return unique;
    }
}
