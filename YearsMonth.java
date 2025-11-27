import java.util.Scanner;
public class YearsMonth {
    

    public static void main(String [] args)
    {   
       Scanner sc = new Scanner(System.in);
       int years=sc.nextInt();
       System.out.println((int)years/365);
       int month=(years%365);
       int months=(years%365)/30;
       int days=month%30;
       System.out.println(months);
       System.out.println(days);
       sc.close();
       
    }
}