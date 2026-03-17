package Day_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

//       BruteForce Approach
        int fact = 1;
        if(n < 1 || n == 1) fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }
        System.out.println(fact);

//        Recursive Method
        int res = factoial(n);
        System.out.println(res);
    }
    public static int factoial(int n){
        if(n < 1 || n == 1) return 1;
        else return n * factoial(n-1);
    }
}
