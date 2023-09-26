package com.exercise;

public class FindHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }
    static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int highestAltitude = 0;
        for (int j : gain) {
            currentAltitude += j;
            if (currentAltitude > highestAltitude) {
                highestAltitude = currentAltitude;
            }
        }
        return highestAltitude;
    }
}
