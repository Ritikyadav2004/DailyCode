package Codeforces.Sheet_2;
import java.util.*;
public class L_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int loopLimit=Math.min(a,b);
        for(int i=(loopLimit);i>=1;i--)
        {
          if(a%i==0 && b%i==0)
          {
            System.out.println(i);
            break;
          }
        }
        sc.close();
    }
}
