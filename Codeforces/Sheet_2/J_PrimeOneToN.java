package Codeforces.Sheet_2;

import java.util.Arrays;
import java.util.Scanner;

public class J_PrimeOneToN {

    // private  static boolean isPrimeByBruteForce(int n)
    // {  
    //     for (int i = 2; i <=Math.sqrt(n); i++) {
    //         if(n%i==0)return false;
    //     }
    //     return true;
    // }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();

      //BRUTE FOREC APPROCAH
    //   for(int i=2;i<=n;i++)
    //   {
    //     if(isPrimeByBruteForce(i))
    //     {
    //         System.out.print(i+" ");
    //     }
    //   }

    //OPTIMIZE APPROCAH
    //1. Sieve of Eratosthenes (Classic)

    boolean isPrime[]=new boolean[n+1];
    Arrays.fill(isPrime,true);
    isPrime[0]=false;
    isPrime[1]=false;
    for(int i=2;i*i<=n;i++)
    {
        for (int j = i*i; j <=n; j+=i) {
            isPrime[j]=false;
        }
       
        
    }
    for (int i = 2; i <=n; i++) {
         if(isPrime[i])
            {
                System.out.print(i+" ");
            }
    }
    
      sc.close();
    }
}
