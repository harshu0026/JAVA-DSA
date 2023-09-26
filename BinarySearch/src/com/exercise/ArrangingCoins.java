package com.exercise;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 1804289383;
        int ans = arrangeCoins(n);
        System.out.println(ans);
    }
    static int arrangeCoins(int n) {
        int sum =0;
        int count =0;
        while(true){
            ++sum;
            if(sum <= n){
                n = n-sum;
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
