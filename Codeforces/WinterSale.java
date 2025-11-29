package Codeforces;
import java.util.Scanner;
public class WinterSale
{
             public static void main(String [] args){
                          Scanner sc= new Scanner(System.in);
                          int x=sc.nextInt();
                          int priceAfterDiscount=sc.nextInt();
                          float originalprice=(100*priceAfterDiscount)/(float)(100-x);
                          System.out.println(String.format("%.2f",originalprice));
                        //   System.out.println(String.format("%2.f", originalprice));
                        //   System.out.println(String.format("%.2f", originalPrice));
                          sc.close();
                          
                          
             }
}