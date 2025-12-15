package Codeforces.Sheet_2;

import java.util.Scanner;

public class Y_Easy_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        if (n == 1) {
            System.out.print(0);
        } else{
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n-2;i++)
        {   
            int c=a+b;
            System.out.print(c+" ");
            //a ko b banao
            a=b;
            //b ko c banao
            b=c;

        }}
        sc.close();
    }
}
