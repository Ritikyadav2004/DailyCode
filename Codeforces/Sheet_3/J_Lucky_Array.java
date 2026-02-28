// Given a number N and an array A of N numbers. Determine if the array is lucky or not.
// Note: the array is lucky if the frequency (number of occurrence) of the minimum element is odd.
// Input
// First line contains a number N (2 ≤ N ≤ 1000) number of elements.

// Second line contains N numbers ( - 105 ≤ Ai ≤ 105).
// Output
// Print "Lucky" (without quotes) if the frequency of the minimum element is odd, otherwise print "Unlucky"(without quotes).



package Codeforces.Sheet_3;
import java.util.Scanner;


public class J_Lucky_Array {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      
        int arr[]=new int[n];
        int i=0;
        int minimum=Integer.MAX_VALUE;
        while(n-- >0)
        {
           arr[i]=sc.nextInt();
            minimum=Math.min(minimum,arr[i]);
           i++;
          
        }
        int count=0;

        for(int j:arr)
        {
             if(minimum==j)
             {
                count++;
             }
        }
        if(count%2!=0)
        {
            System.out.println("Lucky");
        }
        else{
            System.out.println("Unlucky");
        }

        sc.close();

        

    }
}
