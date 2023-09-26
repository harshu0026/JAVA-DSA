package com.main;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        arrayList.add(90);
        arrayList.add(40);
        arrayList.add(30);
        arrayList.add(20);
        arrayList.add(10);

//        System.out.println(arrayList);
//        arrayList.set(0, 100);
//        System.out.println(arrayList);
//        arrayList.remove(2);
//        System.out.println(arrayList);
        System.out.println(arrayList);
        int n = arrayList.get(1);
        System.out.println(n);
        arrayList.add(2, 60);
        System.out.println(arrayList);
    }
}
