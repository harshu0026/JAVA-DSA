import java.util.Scanner;

public class OverLeading {
    public static void main(String[] args) {
        System.out.println(sum(5,4));
//        System.out.println(sum(5));


    }
    static int sum(int a, int b){
        return  a + b;
    }
    static int sum(int b){
        return b;

    }
}
