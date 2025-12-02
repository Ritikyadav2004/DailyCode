package Codeforces;
import java.util.Scanner;
public class NextAlphabet {
    

 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  char ch = sc.next().charAt(0);
  int ascii = (int)ch;
  if(ascii<122)
  { 
   ascii++;
   System.out.println((char)ascii);
  }
  else
  {
   System.out.println('a');
  }
  sc.close();
 }
 
}
