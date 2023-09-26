package com.exercise;

import java.util.ArrayList;

public class KidsWithTheGreatestNumOfCandies {
    public static void main(String[] args) {
        int[] arr = {4,2,1,1,2};
        int extraCandies = 1;
        ArrayList<Boolean> maxArr = kidsWithCandies(arr, extraCandies);
        System.out.println(maxArr);
    }
    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies[0];
        for (int candy : candies) {
            n = Math.max(n, candy);
        }
        ArrayList<Boolean> maxArr = new ArrayList<>(10);
        for (int i = 0; i < candies.length; i++) {
            candies[i] = candies[i] + extraCandies;
            if (candies[i] >= n){
                maxArr.add(i, true);
            }else {
                maxArr.add(i, false);
            }
        }
        return maxArr;
    }
}
