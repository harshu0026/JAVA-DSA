package com.Exercise;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,3,3,3,3,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }
    static int majorityElement(int[] nums) {
        int count =1;
        int n = nums.length;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/2){
                return nums[i];
            }else{
                count = 1;
            }
        }
        return -1;
    }
}
