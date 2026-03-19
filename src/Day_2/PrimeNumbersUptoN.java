package Day_2;

// -------------------------------Sieve of Eratosthenes----------------------------------
import java.util.Arrays;
import java.util.Scanner;
public class PrimeNumbersUptoN {
    public void printPrimeUptoN(int n){
        boolean[] isPrime = new boolean[n+1];

        for(int i=0; i<=n; i++){
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2; i*i <= n; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <=n ; i++) {
            if (isPrime[i]){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        PrimeNumbersUptoN primeNumbersUptoN = new PrimeNumbersUptoN();
        primeNumbersUptoN.printPrimeUptoN(n);

    }
}
