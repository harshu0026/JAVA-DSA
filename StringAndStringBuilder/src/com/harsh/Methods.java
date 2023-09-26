package com.harsh;

public class Methods {
    public static void main(String[] args) {
        String src = "1.1.1.1";
        String ans = defangIPaddr(src);
        System.out.println(ans);

    }
    static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
