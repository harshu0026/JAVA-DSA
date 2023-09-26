import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        String armStrong = armStrong(num);
//        System.out.println(armStrong);

        for (int i= 100; i < 1000; i++){
            if (armStrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean armStrong(int n){
        int original = n;
        int sum = 0;
        while (n > 0){
            int digit = n%10;
            sum += (int) Math.pow(digit, 3);
            n = n/10;
        }
        return sum == original;
    }
}