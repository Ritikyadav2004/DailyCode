
import java.util.Arrays;

public class CountPrime  {
    public static int countPrimes(int n) {
        int count = 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true); 
        if (n > 0) isPrime[0] = false;
        if (n > 1) isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false; // mark multiples  not prime
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
