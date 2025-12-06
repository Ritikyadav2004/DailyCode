package Codeforces.Sheet_2;
import java.util.Scanner;
public class E_Max {
    

 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int arr[] = new int[n];
  int max=-1;
  for(int i=0;i<n;i++)
  {
   arr[i]=sc.nextInt();
   max=Math.max(max,arr[i]);
  }
  
  System.out.println(max);
  sc.close();
  
 }
 
}