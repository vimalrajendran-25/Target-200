package Day_1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int temp = n;
        int sum = 0;

        while(n > 0){
            int ld = n % 10;
            sum += (int) Math.pow(ld,3);
            n /= 10;
        }
        System.out.println(temp == sum ? "armstrong number" : "not-armstrong number");
    }
}
