package Day_1;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

//        BruteForce Approach
        boolean res = powerOfTwo(n);
        System.out.println(res);

//        Optimal Solution - bit manipulation
        boolean ans = bit(n);
        System.out.println(ans);

    }

    private static boolean bit(int n) {
        return n > 0 && ((n & n-1) == 0);
    }

    public static boolean powerOfTwo(int n){
        if(n < 0) return false;
        else if (n == 1) return true;
        else{
            while (n%2 == 0){
                n /= 2;
            }
            if (n == 1) return true;
            else return false;
        }
    }
}
