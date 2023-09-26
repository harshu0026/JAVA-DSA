package com.harsh;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many innings have you played? ");
        int numberOfInnings = in.nextInt();
        float ans = battingAverage(numberOfInnings);
        System.out.println("Your batting average is " +ans);

    }
    static float battingAverage(int n){
        float average;
        Scanner in = new Scanner(System.in);
        int outCount = 0;
        int totalScore = 0;
        for (int i =1; i<=n; i++){
            System.out.print("Enter your " + i + " inning score: ");
            int score = in.nextInt();
            totalScore += score;
            System.out.print("had you got out in this inning? (y/n): ");
            char out = in.next().trim().charAt(0);
            if(out == 'y'){
                outCount++;
            }else {
                outCount += 0;
            }
        }
        System.out.println(totalScore);
        System.out.println(outCount);
        average = (float) totalScore /outCount;
        return average;
    }
}
