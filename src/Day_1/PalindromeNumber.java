package Day_1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int temp = n;
        int rev = 0;
        while(n > 0){
            int ld = n % 10;
            rev = rev * 10 + ld;
            n /= 10;
        }
        if(rev == temp) System.out.println("Palindrome");
        else System.out.println("Not-Palindrome");
    }
}
