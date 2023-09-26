package com.harsh;

public class EvenNumberInMonth {
    public static void main(String[] args) {
        countWhenKunalWillGoOut();
    }
    static void countWhenKunalWillGoOut(){
        int august = 31;
        int count = 0;
        for (int i = 1; i <= august; i++) {
            if (i%2==0){
                count++;
            }
        }
        System.out.println("So there are " +count+ " days, when kunal can go out!");
    }
}
