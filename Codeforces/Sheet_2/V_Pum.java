package Codeforces.Sheet_2;

import java.util.Scanner;

public class V_Pum {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(count%4!=0)
                {
                    System.out.print(count+" ");
                }
                count++;
            }
            System.out.print("PUM");
            System.out.println();
        }
        sc.close();
    }
}
