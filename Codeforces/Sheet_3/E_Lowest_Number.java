package Codeforces.Sheet_3;

import java.util.Scanner;

public class E_Lowest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int min=Integer.MAX_VALUE;
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {

            arr[i]=sc.nextInt();
           
            
        }
        for (int i = 0; i < arr.length; i++) {
             min=Math.min(min,arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==min)
            {
                System.out.println(arr[i]+" "+(i+1));
                break;
            }
        }
        sc.close();
    }
}
