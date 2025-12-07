// package Codeforces.Sheet_2;
import java.util.*;
public class I_Pallindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0, original=n;
        while(n!=0)
        {
            reverse=reverse*10 +( n%10);
            
            n/=10;
        }
        if(reverse==original)
        {
            System.out.println(reverse+"\nYES");
        }
        else{
            System.out.println(reverse+"\nNO");
        }
        sc.close();
    }
}