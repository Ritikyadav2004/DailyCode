package Codeforces.Sheet_2;

import java.util.Scanner;

public class M_LuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean found=false;
        for(int i=a;i<=b;i++)
        {  
            boolean isLucky=true;
            int a1=i;
           while(a1!=0)
           {
            int temp=a1%10;
            // at a timr me ek hee number check kr rha huhu 
            if(temp!=4 && temp!=7)
            {
                 isLucky=false;
                 break;
            }
            a1/=10;
           }
           if(isLucky)
           {
            System.out.print(i+" ");
            found=true;
           }
          
        }
         if(!found)
            System.out.println(-1);
        sc.close();
    }
}
