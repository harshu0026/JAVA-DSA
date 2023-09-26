package com.exercise;

public class SpacialArrayWithXElement {
    public static void main(String[] args) {
        int[] arr = {3,5};
        int ans = specialArray(arr);
        System.out.println(ans);
    }
    static int specialArray(int[] nums) {
        int count = 0;
        for(int x = 0; x<= nums.length; x++){
            for (int num : nums) {
                if (num >= x) {
                    count++;
                }
            }
            if(count == x){
                return count;
            }
            count = 0;
        }
        return -1;
    }
}
