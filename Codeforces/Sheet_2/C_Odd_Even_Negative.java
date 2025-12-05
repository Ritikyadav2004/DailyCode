package Codeforces.Sheet_2;

import java.util.Scanner;

public class C_Odd_Even_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddCount=0;
        int evenCount=0;
        int positiveCount=0;
        int negativeCount=0;
    
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i = 0;
        while(n-- > 0) {
            arr[i] = sc.nextInt();
            i++;
        }


        for(int j:arr)
        {
            if(j%2==0 )
                {
                    evenCount++;
                }
            else if(j%2!=0)
            {
                oddCount++;
            }
            if(j>0)
            {
                positiveCount++;
            }
            else if(j<0)
            {
                negativeCount++;
            }
            
        }
System.out.println("Even: "+evenCount);
System.out.println("Odd: "+oddCount);
System.out.println("Positive: "+positiveCount);
System.out.println("Negative: "+negativeCount);

        sc.close();
    
}
}


// Even: 3
// Odd: 2
// Positive: 1
// Negative: 3