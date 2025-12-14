package Codeforces.Sheet_2;

import java.util.Scanner;

public class X_Convert_To_Decimal_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while(n-- >0)
        {   
            StringBuilder str = new StringBuilder();
            int var = sc.nextInt();
            while(var!=0)
            {
                int temp=var%2; 
                var=var/2;
                if(temp==1)
                {
                    str.append("1");
                }
            }
            int num = Integer.parseInt(str.toString(), 2);
 
            System.out.println(num);
        }
        sc.close();
       


    }
}
