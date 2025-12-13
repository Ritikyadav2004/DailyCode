package Codeforces.Sheet_2;
import java.util.*;
public class T_Shape2
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for (int j = n-1-i; j>0; j--) {
                System.out.print(" ");
            }
            for(int j=0;j<((2*i)+1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
sc.close();
    }
}