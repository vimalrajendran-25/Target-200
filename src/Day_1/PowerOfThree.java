package Day_1;

import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

//      BruteForce Approach
        boolean ans = isPowerOfThree(n);
        System.out.println(ans);


//        Optimal Solution
        boolean res = powerOfThree(n);
        System.out.println(res);
    }
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;

        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }


    private static boolean powerOfThree(int n) {
        return n > 0 && Math.pow(3,19) % n == 0;
    }
}
