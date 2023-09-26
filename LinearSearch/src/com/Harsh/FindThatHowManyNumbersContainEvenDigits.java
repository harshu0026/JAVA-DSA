package com.Harsh;

public class FindThatHowManyNumbersContainEvenDigits {
    public static void main(String[] args) {
        int[] nums = {555,901,482,-1771};
        int ans = evenNum(nums);
        System.out.println(ans);
    }
    static int evenNum(int[] nums){
        int count = 0;
        int digitCount = 0;
        for (int num : nums){
            if (num < 0){
                num += -1;
            }
            while (num > 0){
                digitCount++;
                num /= 10;
            }
            if (digitCount %2 == 0){
                count++;
            }
            digitCount = 0;
        }
        return count;
    }
}
