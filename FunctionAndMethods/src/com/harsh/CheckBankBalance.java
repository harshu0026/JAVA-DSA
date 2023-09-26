package com.harsh;

import java.util.Scanner;

public class CheckBankBalance {
        public static int roundToNearestMultipleOfTen(int purchaseAmount) {
            int remainder = purchaseAmount % 10;
            int nearestMultipleBelow = purchaseAmount - remainder;
            int nearestMultipleAbove = purchaseAmount + (10 - remainder);

            if (remainder < 5) {
                return nearestMultipleBelow;
            } else {
                return nearestMultipleAbove;
            }
        }

        public static void main(String[] args) {
            // Test cases
            int[] purchaseAmounts = {0, 5, 10, 15, 20, 25, 30};

            for (int purchaseAmount : purchaseAmounts) {
                int roundedAmount = roundToNearestMultipleOfTen(purchaseAmount);
                System.out.println("Purchase Amount: " + purchaseAmount +
                        " | Rounded Amount: " + roundedAmount);
            }
        }
    }
