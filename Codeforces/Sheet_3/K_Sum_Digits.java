package Codeforces.Sheet_3;

import java.util.Scanner;

public class K_Sum_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int  i=0;
        int sum=0;
        while(n-- >0)
        {
               arr[i]=sc.nextInt();
               
               sum+=arr[i];
               i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
