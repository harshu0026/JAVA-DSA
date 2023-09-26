package com.Exercise;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        for(int num : nums){
            if (list.contains(num)){
                return true;
            }
            list.add(num);
        }
        return false;
    }
}
