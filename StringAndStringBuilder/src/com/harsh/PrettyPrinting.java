package com.harsh;

public class PrettyPrinting {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.printf("%.2f", pi);
        System.out.printf("%n");
        float f = 354.245f;
        System.out.printf("%.1f", f);
        System.out.printf("%n");
        String src = "Harsh";
        System.out.printf("%s", src);
    }
}
