package Codeforces.Contest_2;

import java.util.Scanner;

public class F_Break_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=Integer.MIN_VALUE;
        int count=0;
        while(n-- >0)
        {   
            count=0;
            long number=sc.nextLong();
            while (number % 2 == 0) {
                number /= 2;
                count++;
            }

            max=Math.max(max, count);

        }
        System.out.println(max);
        sc.close();
    }
}
