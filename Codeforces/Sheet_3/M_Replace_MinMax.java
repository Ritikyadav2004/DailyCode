package Codeforces.Sheet_3;

import java.util.Scanner;

public class M_Replace_MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int i=0;
        int min=Integer.MAX_VALUE;
        int minIndex=0;
        int maxIndex=0;
        int max=Integer.MIN_VALUE;
        while(n-- >0)
        {
            arr[i]=sc.nextInt();
            
            min=Math.min(min,arr[i]);
            max=Math.max(max, arr[i]);
            i++;
        
        }

        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==min)
            {
                minIndex=j;
            }
            if(arr[j]==max)
            {
                maxIndex=j;
            }
        }

        int temp=arr[minIndex];
        arr[minIndex]=arr[maxIndex];
        arr[maxIndex]=temp;
        
        for(int k:arr)
        {
            System.out.print(k+" ");
        }


        sc.close();
        



    }
}
