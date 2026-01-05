package Codeforces.Sheet_3;

import java.util.Scanner;

public class G_Palindrome_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        boolean ispallindrome=true;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<=n/2;i++)
        {
            if(arr[i]!=arr[n-i-1])
            {
                   ispallindrome=false;
                   break;
            }
        }
        if(ispallindrome)
        {   
            System.out.println("YES");
        }
        else{
System.out.println("NO");
        }
        sc.close();
    }
}
