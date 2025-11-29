package Codeforces;
import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        int[] interval  = {0,25,50,75,100};
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        if (x < 0 || x> 100)
             System.out.println("Out of Intervals");
        else{
        for (int i = 0; i < interval.length-1; i++) {
            if(x>interval[i] && x<interval[i+1])
            {
                System.out.println("Interval "+"("+interval[i]+","+interval[i+1]+"]");
                break;
            }
 
            else if(x>=interval[i] && x<interval[i+1])
            {   
                 System.out.println("Interval "+"["+interval[i]+","+interval[i+1]+"]");
                 break;
            }
            
            else if(x>=interval[i] && x<=interval[i+1])
            {    
                if(x<=25){
                    System.out.println("Interval "+"["+interval[i]+","+interval[i+1]+"]");
                    break;
                }
                else{
                 System.out.println("Interval "+"("+interval[i]+","+interval[i+1]+"]");
                 break;
                }
            }
            
        }
        }

 
        sc.close();
    }
}
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] interval = {0, 25, 50, 75, 100};
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        // Pehle range check: [0,100] ke bahar hua to seedha Out of Intervals
        if (x < 0.0 || x > 100.0) {
            System.out.println("Out of Intervals");
        } else {
            // Ab sirf 0 se 100 ke beech wale values check karenge
            for (int i = 0; i < interval.length - 1; i++) {
                if (x >= interval[i] && x <= interval[i + 1]) {
                    if (i == 0) {
                        // Pehla interval: [0,25]
                        System.out.println("Interval [" + interval[i] + "," + interval[i + 1] + "]");
                    } else {
                        // Baaki sab: (25,50], (50,75], (75,100]
                        System.out.println("Interval (" + interval[i] + "," + interval[i + 1] + "]");
                    }
                    break;
                }
            }
        }

        sc.close();
    }
}

*/