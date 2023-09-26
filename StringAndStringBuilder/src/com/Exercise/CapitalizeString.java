package com.Exercise;

public class CapitalizeString {
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe";
        System.out.println(capitalizeTitle(title));
    }
    static String capitalizeTitle(String title) {
       String[] arr = title.split(" ");
       for (int i = 0; i<arr.length; i++){
           String word = arr[i];
           arr[i] = "";
           for (int j = 0; j < word.length(); j++) {
               if (word.length() <= 2){
                   arr[i] = word.toLowerCase();
               }else {
                   if (j == 0){
                       arr[i] += Character.toUpperCase(word.charAt(j));
                   }else {
                       arr[i] += Character.toLowerCase(word.charAt(j));
                   }
               }
           }
       }
       return String.join(" ", arr);
    }
}
