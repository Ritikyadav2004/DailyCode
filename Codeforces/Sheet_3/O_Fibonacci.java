// Note: In order to create the Fibonacci sequence use the following function:

// fib(1) = 0.
// fib(2) = 1.
// fib(n) = fib(n - 1) + fib(n - 2).
package Codeforces.Sheet_3;

import java.util.Scanner;

public class O_Fibonacci {

//     public static int fibo(int n)
//     {
//         if(n==1) return 0;
//         if(n==2) return 1;
//         return fibo(n-1)+fibo(n-2);
//     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long a=0;
        long b=1;
        long c;
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        
        if(n==1) System.out.println(a);
        else System.out.println(b);
        sc.close();
    }
}
