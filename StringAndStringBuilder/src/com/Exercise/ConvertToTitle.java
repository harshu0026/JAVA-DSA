package com.Exercise;

public class ConvertToTitle {
    public static void main(String[] args) {
        int col = 700;
        System.out.println(convertToTitle(col));
    }
    static String convertToTitle(int columnNumber){
        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26 + 1;
            char character = (char)(remainder + 'A' - 1);
            sb.append(character);
            columnNumber = (columnNumber - remainder) / 26;
        }
        return sb.reverse().toString();
    }
}
