package Day_2;

import java.util.Scanner;

public class Lcm {

//    BruteForce Approach
//    static int findLcm(int a, int b){
//        int result = Math.max(a, b);
//        while (true){
//            if(result % a == 0 && result % b == 0){
//                break;
//            }
//            result++;
//        }
//        return result;
//    }

//    Optimal Solution
    static int findPrimee(int a, int b){
        return a*b/gcd(a,b);
    }

    static int gcd(int a,  int b){
        while(a>0 && b >0){
            if(a > b){
                a = a%b;
            }
            else {
                b = b % a;
            }
        }
        if(a == 0) return b;
        else return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

//        System.out.println(findLcm(a,b));
        System.out.println(findPrimee(a,b));
    }
}
