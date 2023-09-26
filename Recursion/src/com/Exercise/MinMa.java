package com.Exercise;

public class MinMa {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int ans = minMax(arr, arr.length);
        System.out.println(ans);
    }
    static int minMax(int[] arr, int n){
        if(n == 1)
            return arr[0];

        return Math.min(arr[n-1], minMax(arr, n-1));
    }
}
