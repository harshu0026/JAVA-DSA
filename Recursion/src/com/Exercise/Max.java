package com.Exercise;

public class Max {
    public static void main(String[] args) {
        int[] arr = {2,6,8,42,68,66};
        int ans = max(arr, arr.length);
        System.out.println(ans);
    }
    static int max(int[] arr, int n){
        if (n == 1){
            return arr[0];
        }
        return Math.max(arr[n-1], max(arr, n-1));
    }
}
