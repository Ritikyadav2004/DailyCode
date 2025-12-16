package Codeforces.Contest_2;

import java.util.Scanner;

public class B_Drawing_X {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                // System.out.print(i+""+j+"  ");
                if(i==j && i!=(n/2))
                {
                    System.out.print("\\"+"");
                }
                else if(i==(n/2) && j==(n/2))
                {
                    System.out.print("X");
                }
                else if(i+j==(n-1))
                {
                    System.out.print("/"+"");
                }
                else
                {
                    System.out.print("*"+"");
                }
                

            }
            System.out.println();
        }
        sc.close();
    }
}
