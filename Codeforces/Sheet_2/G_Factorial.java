// package Codeforces.Sheet_2;

import java.util.Scanner;

public class G_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while(n-->0)
        {
            int k=sc.nextInt();
            long fact=1;
            for(int i=1;i<=k;i++)
            {
                fact=fact*i;            
            }
            System.out.println(fact);
        }
        sc.close();
    }
}
