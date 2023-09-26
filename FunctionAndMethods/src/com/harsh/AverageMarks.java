package com.harsh;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many subjects do you have? ");
        int subjects = in.nextInt();
        float ans = averageMarks(subjects);
        System.out.println("Average of your marks is " + ans);

    }
    static float averageMarks(int numberOfSubjects){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i<=numberOfSubjects; i++){
            System.out.print("Enter your " + i + " subject marks out of 100: ");
            int marks = in.nextInt();
            sum += marks;
        }
        return (float) sum /numberOfSubjects;
    }
}
