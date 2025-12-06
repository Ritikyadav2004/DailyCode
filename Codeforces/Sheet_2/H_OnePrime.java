package Codeforces.Sheet_2;

import java.util.Scanner;

public class H_OnePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean check=false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {   check=true;
                System.out.println("NO");
                break;
            }
        }

        if(!check)
        {
            System.out.println("YES");
        }
        sc.close();
    }
}
