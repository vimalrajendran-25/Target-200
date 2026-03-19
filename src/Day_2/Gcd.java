package Day_2;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number's: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

//        BruteForce Approach
        int gcd = 1;
        for(int i=1; i<=Math.min(n1,n2); i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);

//        Better Approach
        for(int i=Math.min(n1,n2); i>0; i--){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);

//        Optimal Approach
        while(n1 > 0 && n2 >0){
            if(n1 > n2){
                n1 = n1 % n2;
            }
            else {
                n2 = n2 % n1;
            }
        }
        if(n1 == 0) System.out.println(n2);
        else System.out.println(n1);
    }
}
