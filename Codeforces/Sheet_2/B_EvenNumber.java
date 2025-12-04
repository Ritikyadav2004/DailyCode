package Codeforces.Sheet_2;
import java.util.Scanner;
public class B_EvenNumber {
    

 public static void main(String args[])
 
 {
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  boolean check=false;
  for(int i=2;i<=n;i++)
  {
   if(i%2==0)
   {
    check=true;
    System.out.println(i);
   }
   
   
  }
  if(!check)
   {
    System.out.println(-1);
   }
   sc.close();
 }
}