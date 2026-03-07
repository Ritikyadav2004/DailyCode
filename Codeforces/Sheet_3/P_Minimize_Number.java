package Codeforces.Sheet_3;

import java.util.Scanner;

public class P_Minimize_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        boolean isOdd=false;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0)
            {
                isOdd=true;
            }
        }
        while(!isOdd)
        {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]%2==0)
                {
                    arr[i]=arr[i]/2;
                }
                else{
                    isOdd=true;
                    break;
                }
            }
            if(!isOdd)
            count++;

            
        }
        System.out.println(count);
            sc.close();

    }
}
