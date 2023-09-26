package com.harsh;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a fruit name: ");
//        String fruit = in.next();
//        switch (fruit) {
//            case "mango" -> System.out.println("King of Fruits");
//            case "banana" -> System.out.println("Monkeys favourite fruit");
//            case "grapes" -> System.out.println("Bunch of Fruits");
//            default -> System.out.println("Please enter a correct fruit name!");
//        }
        System.out.print("Enter a Day: ");
        int day = in.nextInt();
        switch (day) {
            case 1,2,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Please enter a correct day!");
        }
    }
}
