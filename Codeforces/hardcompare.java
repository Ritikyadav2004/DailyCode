
/*
Given 4 numbers A,B,C
 and D
. If AB
 > CD
 print "YES" otherwise, print "NO".

Input
Only one line containing 4 numbers A,B,C
 and D
 (1≤A,C≤107)
 , (1≤B,D≤1012)

Output
Print "YES" or "NO" according to the problem above
*/
package Codeforces;
import java.util.Scanner;
public class hardcompare
{   
    
    
    
    public static long pow(long base,long expo)
    {   
        long result=1;
        for(long i=1;i<=expo;i++)
        {
            result*=base;
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b= sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long fi1=pow(a,b);
        long fi2=pow(c,d);
        if(fi1>fi2)
        
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }
}


//MODULER APPROACH
/*
import java.util.Scanner;
public class Main
{   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b= sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        if (b *Math.log(a)  >  d*Math.log(c))
        {
            System.out.println("YES");
        }
           else
           {
               System.out.println("NO");
           }

        sc.close();
    }
} */