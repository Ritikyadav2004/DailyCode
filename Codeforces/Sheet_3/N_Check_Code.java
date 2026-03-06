package Codeforces.Sheet_3;
import java.util.*;
public class N_Check_Code {

    public static boolean checkRule(int a,int b,String str)
    {

         if(str.length()!=a+b+1)
            return false;

         if(str.charAt(a)!='-')
            return false;
          
         for(int i=0;i<str.length();i++)
         {
            if(i==a)
            {
                if(str.charAt(i)!='-')return false;
            }
            else{
                if(!Character.isDigit(str.charAt(i)))
                {
                    return false;
                }
            }
         }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        String str=sc.next();

        if(checkRule(a, b, str))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        sc.close();





    }
}
