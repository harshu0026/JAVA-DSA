package com.exercise;

public class MissingPositiveNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        int ans = findKthPositive(arr, k);
        System.out.println(ans);
    }
    static int findKthPositive(int[] arr, int k) {
        int []a=new int[2001];
        for(int val:arr){
            a[val]++;
        }
        int count=0;
        for(int i=1;i<=2000;i++){
            if(a[i]==0){
                count++;
            }
            if(count==k){
                return i;
            }
        }
        return -1;
    }
}
