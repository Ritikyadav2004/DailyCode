package Codeforces;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check=false;
        while(n>0)
        {
            int temp1 = n%10;
            n/=10;
            int temp2 = n%10;
            n/=10;
            if(temp1%temp2==0 || temp2%temp1==0)
            {
                check=true;
                System.out.println("YES");
                break;
            }
        }
        if(!check)
        {
            System.out.println("NO");

        }
        sc.close();
    }
}
