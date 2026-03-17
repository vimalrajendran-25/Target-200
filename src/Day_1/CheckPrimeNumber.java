package Day_1;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

//        Brute Force Approach
        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0) cnt++;
        }
        if(cnt == 2) System.out.println("PrimeNumber");
        else System.out.println("Not-PrimeNumber");

//        Optimal Approach
        int total = 0;
        for(int i=1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                total++;
                if(n/i != i) total++;
            }
        }
        if(total == 2) System.out.println("Prime");
        else System.out.println("Not-Prime");
    }
}
