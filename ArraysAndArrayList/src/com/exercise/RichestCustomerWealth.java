package com.exercise;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,2,4},
                {1,5,6}
        };
        int ans = maximumWealth(arr);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts) {
        int large = accounts[0][0];
        for(int[] customer : accounts){
            int Sum = 0;
            for(int bank : customer)
                Sum += bank;
            large = Math.max(large, Sum);
        }
        return large;
        }
    }
