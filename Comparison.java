import java.util.*;
public class Comparison {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        char s = sc.next().charAt(0);

        int b = sc.nextInt();
        
        if(s=='<')
        {
            if(a<=b)
            {
                System.out.println("Right");
            }
            else
            {
                System.out.println("Wrong");
            }
            
        }
        
        else if(s=='>')
        {
            if(a>=b)
            {
                System.out.println("Right");
            }
            else
            {
                System.out.println("Wrong");
            }
            
        }
        
        else if(s=='=')
        {
            if(a==b)
            {
                System.out.println("Right");
            }
            
            else
            {
                System.out.println("Wrong");
            }
        }
        sc.close();
    }
}