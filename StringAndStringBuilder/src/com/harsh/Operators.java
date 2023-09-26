package com.harsh;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + '1');
        System.out.println();
        System.out.println((char) ('a' + 1));
        System.out.println((char) (65 + 1));
        System.out.println("a" + 1);
        System.out.println("Harsh" + new ArrayList<>());
        System.out.println("Harsh" + new Integer(56));

    }
}
