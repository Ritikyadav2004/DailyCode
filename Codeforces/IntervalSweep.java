package Codeforces;

import java.util.Scanner;

public class IntervalSweep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a + b > 0) && Math.abs(a - b) <= 1)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
