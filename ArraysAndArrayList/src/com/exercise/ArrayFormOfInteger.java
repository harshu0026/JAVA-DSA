package com.exercise;

import java.util.ArrayList;

public class ArrayFormOfInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0};
        int k = 34;
        ArrayList<Integer> ans = addToArrayForm(arr, k);
        System.out.println(ans);

    }
    static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>(10);
        int len = num.length - 1;
        while (len >= 0 || k != 0) {
            if (len >= 0) {
                k += num[len];
                len--;
            }
            list.add(0,k % 10);
            k /= 10;
        }
        return list;
    }
}
