package Codeforces.Sheet_3;
import java.util.Scanner;

public class I_Smallest_Pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase-- >0)
        {
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++)
            {
               arr[i]=sc.nextInt();
            }
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {   
                    int cal=arr[i]+arr[j]+j-i;
                    if(cal<min)
                    {
                    min=cal;
                    }
                }
            }
            System.out.println(min);
        }
        sc.close();
    }
}
