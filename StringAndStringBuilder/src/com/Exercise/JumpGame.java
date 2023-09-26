package com.Exercise;

public class JumpGame {
    public static void main(String[] args) {
        String  s = "01101110";
        int minJump = 2;
        int maxJump = 3;
        boolean ans = canReach(s, minJump, maxJump);
        System.out.println(ans);
    }
    static boolean canReach(String s, int minJump, int maxJump) {
        return minJump + maxJump == s.length() - 1;
    }
}
