package Codeforces.Sheet_2;

import java.util.Scanner;

public class R_Sequence_of_Numbers_and_Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<=0 || b<=0)
            {
                break;

            }
            int count=0;
           
            for (int i = Math.min(a,b); i<=Math.max(a, b); i++) {
                System.out.print(i+" ");
                count+=i;
            }
            System.out.println("sum ="+count);
        }
        sc.close();
    }
}
