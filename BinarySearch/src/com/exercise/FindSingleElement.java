package com.exercise;

public class FindSingleElement {
    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};
        int ans = singleNonDuplicate(arr);
        System.out.println(ans);
    }
    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(start == end){
                return nums[start];
            }
            if(nums[mid] == nums[mid-1]){
                if ((mid-1)%2!=0){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else if(nums[mid] == nums[mid+1]){
                if ((mid+1)%2!=0){
                    start = mid+1;
                }else{
                    end = mid -1;
                }
            }else{
                return nums[mid];
            }
        }
        return -1;
    }
}
