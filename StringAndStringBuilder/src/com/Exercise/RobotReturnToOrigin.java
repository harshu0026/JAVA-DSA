package com.Exercise;


public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "UD";
        boolean ans = judgeCircle(moves);
        System.out.println(ans);
    }
    static boolean judgeCircle(String moves) {
        int upDown = 0;
        int leftRight = 0;

        for (char ch : moves.toCharArray()){
            if (ch == 'U'){
                upDown++;
            } else if (ch == 'D') {
                upDown--;
            } else if (ch == 'R') {
                leftRight++;
            }else if (ch == 'L'){
                leftRight--;
            }
        }
        return (upDown == 0 && leftRight == 0);
    }
}
