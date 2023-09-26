package com.exercise;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 111111;
        int ans = mySqrt(x);
        System.out.println(ans);
    }
    static int mySqrt(int x) {
            if (x == 0) {
                return 0;
            }
            if (x == 1) {
                return 1;
            }

            for (int i = 1; i <= x / 2; i++) {
                if ((long) i * i == x)
                    return i;
                else if ((long) i * i > x) {
                    return i - 1;
                }
            }
            return x / 2;
    }

}
