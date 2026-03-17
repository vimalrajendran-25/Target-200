package Day_1;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int cnt = 0;

//        BruteForce Approach
        while(n != 0){
            n /= 10;
            cnt++;
        }
        System.out.println(cnt);

//        Better Approach
        int res = (int) Math.log10(n)+1;
        System.out.println(res);
    }
}
