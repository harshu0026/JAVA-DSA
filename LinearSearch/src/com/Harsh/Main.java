package com.Harsh;

public class Main {
    public static void main(String[] args) {
        String name = "Harsh";
        char target = 'a';
        boolean ans = isAvailable(name, target);
        boolean ans2 = isAvailable2(name, target);
        System.out.println(ans2);
        System.out.println(ans);

    }
    static boolean isAvailable2(String name, char target){
        if (name.isEmpty()){
            return false;
        }
        for (char ch : name.toCharArray()) {
            if (target == ch){
                return true;
            }

        }
        return false;
    }

    static boolean isAvailable(String name, char target){
        if (name.isEmpty()){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)){
                return true;
            }

        }
        return false;
    }
}