package Day_1;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = scanner.nextInt();

//        BruteForce Approach
        int rev = 0;
        while(n > 0){
            int ld = n % 10;
            rev = rev * 10 + ld;
            n /= 10;
        }
        System.out.print(rev);

//        Better Approach
        int revNum = 0;
        while(n > 0){
            int rem = n % 10;
            if(revNum > Integer.MAX_VALUE / 10 || revNum < Integer.MIN_VALUE / 10) revNum = 0;
            revNum = revNum * 10 + rem;
            n /= 10;
        }

        System.out.println(revNum);
    }
}
