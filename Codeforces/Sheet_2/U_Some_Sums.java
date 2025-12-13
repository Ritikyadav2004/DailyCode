package Codeforces.Sheet_2;

import java.util.Scanner;

public class U_Some_Sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b= sc.nextInt();
        int sum=0;
        // LOOPS FROM 1 TO N
        for (int i = 1; i <= n; i++) {
            int count=0;
            int j=i;
            while(j!=0)
            {
                int temp=j%10;
                count+=temp;
                j/=10;
            }
            if(a<=count && count<=b)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
