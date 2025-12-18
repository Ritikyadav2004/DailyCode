package Codeforces.Contest_2;

import java.util.Scanner;

public class D_Range_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            if (a > b) {
                long temp = a;
                a = b;
                b = temp;
            }
            long terms=b-a;
            long sum=(terms+1)*(a+b)/2;

            // for(int i=a;i<=b;i++ )
            // {
            //    sum+=i;
            // }
            System.out.println(sum);

        }
        sc.close();
    }
}
