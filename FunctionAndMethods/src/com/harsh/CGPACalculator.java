package com.harsh;

import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many students' CGPA do you want to check? ");
        int students = in.nextInt();
        System.out.println("Enter grade only between (A, B, C) out of it will be invalid!");
        for(int i = 1; i <= students; i++){
            float cgpa = CGPACount();
            System.out.println("On a 10.0 scale, " + i + " Student CGPA for these subjects is approximately " +cgpa+ "!");
        }

    }
    static float CGPACount(){
            float A,B,C;
            A = 4;
            B = 3;
            C = 2;
            int mathsCH, electricCH, CSCH, DSCH;
            mathsCH = 3;
            electricCH = 2;
            CSCH = 4;
            DSCH = 4;
            int sumOfCredits = mathsCH + electricCH + CSCH + DSCH;
            float math, electric, cs, ds;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your maths grade: ");
        char grade = in.next().trim().charAt(0);
        if(grade == 'A' || grade == 'a'){
            math = A * mathsCH;
        } else if (grade == 'B' || grade == 'b') {
            math = B * mathsCH;
        }else {
            math = C * mathsCH;
        }
        System.out.print("Enter your electrical grade: ");
        char grade1 = in.next().trim().charAt(0);
        if(grade1 == 'A'|| grade1 == 'a'){
            electric = A * electricCH;
        } else if (grade1 == 'B' || grade1 == 'b') {
            electric = B * electricCH;
        }else {
            electric = C* electricCH;
        }
        System.out.print("Enter your cs grade: ");
        char grade2 = in.next().trim().charAt(0);
        if(grade2 == 'A' || grade2 == 'a'){
            cs = A * CSCH;
        } else if (grade2 == 'B' || grade2 == 'b') {
            cs = B * CSCH;
        }else {
            cs = C * CSCH;
        }
        System.out.print("Enter your ds grade: ");
        char grade3 = in.next().trim().charAt(0);
        if(grade3 == 'A' || grade3 == 'a'){
            ds = A * DSCH;
        } else if (grade3 == 'B' || grade3 == 'b') {
            ds = B * DSCH;
        } else{
            ds = C * DSCH;
        }

        float sumOfGrades = math + electric + cs + ds;
        return  sumOfGrades/sumOfCredits;

    }
}
