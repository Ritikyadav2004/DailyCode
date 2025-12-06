package Codeforces.Sheet_2;

import java.util.Scanner;

public class D_FixedPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=-1;
        while(a!=1999)
        {
             a=sc.nextInt();
             if(a!=1999)
             {
                System.out.println("Wrong");
             }
             else
             {
                System.out.println("Correct");
            
             }
        }
        sc.close();
        
    }
}
