// int : 32 Bit integer.
// long long : 64 bit integer
// Char : 8 bit Characters & symbols
// Float : 32 bit real value
// Double : 64 bit real value

import java.util.Scanner;
public class Main1
{

    public static void main(String[] args)

{

     Scanner sc = new Scanner(System.in);
     int a  = sc.nextInt();
     long b =  sc.nextLong();
     char ch = sc.next().charAt(0);
     float c  = sc.nextFloat();
     double d = sc.nextDouble();

      System.out.println(a);
      System.out.println(b);
      System.out.println(ch);
      System.out.println(c);
      System.out.println(d);
      sc.close();

}
}