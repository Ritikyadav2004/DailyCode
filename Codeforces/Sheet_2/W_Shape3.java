package Codeforces.Sheet_2;

import java.util.Scanner;

public class W_Shape3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    // upper traingle
    for(int i=0;i<n;i++)
        {
            for (int j = n-1-i; j>0; j--) {
                System.out.print(" ");
            }
            for(int j=0;j<((2*i)+1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++)
        {
           
            //PRINT SPACES
           for(int j=1;j<i;j++)
           {
           System.out.print(" ");
           }
           for(int j=(2*(n-i))+1;j>=1;j--)
           {
               System.out.print("*");
           }
             System.out.println();
         
           
            
        }
        sc.close();
    }
    
}
