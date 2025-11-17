import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = sc.nextInt();
        if(x==0 && y==0)
        {
            System.err.println("Origin");
        }
        else if(x>0 && y>0)
        {
            System.out.println("Q1");
        }
        else if(x<0 && y>0)
        {
            System.out.println("Q2");
        }
        else if(x<0 && y<0)
        {
            System.out.println("Q3");
        }
        else
        {
            System.out.println("Q4");
        }
        sc.close();
    }
}
